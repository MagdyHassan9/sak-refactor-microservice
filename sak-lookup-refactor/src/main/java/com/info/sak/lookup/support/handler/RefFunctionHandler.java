package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefFunction;
import com.info.sak.lookup.service.RefFunctionService;
import com.info.sak.lookup.support.dto.RefFunctionDto;
import com.info.sak.lookup.support.mapper.RefFunctionMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefFunctionHandler {

    private RefFunctionMapper functionMapper;
    private RefFunctionService refFunctionService;
    private PageUtils<RefFunction> pageUtils;

    public ResponseEntity listRefFunctionHandler() {
        List<RefFunction> functionList = refFunctionService.listAll();
        List<RefFunctionDto> refFunctionDtoList = functionMapper.toDtoList(functionList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refFunctionDtoList, (long) refFunctionDtoList.size()));
    }

    public ResponseEntity listRefFunctionHandler(int page, int size) {
        List<RefFunction> refFunctions = refFunctionService.listAll();
        Page<RefFunction> refFunctionsPage = pageUtils.convertListToPage(refFunctions, page, size);
        List<RefFunctionDto> refFunctionDtoList = functionMapper.toDtoList(refFunctionsPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refFunctionDtoList, refFunctionsPage.getTotalElements()));
    }

    public ResponseEntity createRefFunctionHandler(RefFunctionDto refFunction) {
        RefFunction refFunctionCreated = refFunctionService.createEntity(functionMapper.toEntity(refFunction));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(functionMapper.toDto(refFunctionCreated)));
    }

    public ResponseEntity updateRefFunctionHandler(RefFunctionDto refFunction) {
        RefFunction refFunctionCreated = refFunctionService.updateEntity(functionMapper.toEntity(refFunction));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(functionMapper.toDto(refFunctionCreated)));
    }

    public ResponseEntity handleRefFunctionFindById(Integer refFunctionId) {
        RefFunction refFunction = refFunctionService.findById(refFunctionId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(functionMapper.toDto(refFunction)));
    }

    public ResponseEntity handleRefFunctionDeleteById(Integer refFunctionId) {
        refFunctionService.deleteEntity(refFunctionId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }


}
