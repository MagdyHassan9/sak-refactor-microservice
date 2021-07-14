package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefRequestCustTypes;
import com.info.sak.lookup.service.RefRequestCustTypesService;
import com.info.sak.lookup.support.dto.RefRequestCustTypesDto;
import com.info.sak.lookup.support.mapper.RefRequestCustTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefRequestCustTypesHandler {
    RefRequestCustTypesMapper refRequestCustTypesMapper;
    RefRequestCustTypesService refRequestCustTypesService;
    private PageUtils<RefRequestCustTypes> pageUtils;

    public ResponseEntity listRefRequestCustTypesHandler() {
        List<RefRequestCustTypes> requestCustTypesList = refRequestCustTypesService.listAll();
        List<RefRequestCustTypesDto> refRequestCustTypesDtoList = refRequestCustTypesMapper.toDtoList(requestCustTypesList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refRequestCustTypesDtoList, (long) refRequestCustTypesDtoList.size()));
    }
    public ResponseEntity listRefRequestCustTypesHandler(int page, int size) {
        List<RefRequestCustTypes> requestCustTypesList = refRequestCustTypesService.listAll();
        Page<RefRequestCustTypes> refRequestCustTypesPage = pageUtils.convertListToPage(requestCustTypesList, page, size);
        List<RefRequestCustTypesDto> refRequestCustTypesDtoList = refRequestCustTypesMapper.toDtoList(refRequestCustTypesPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refRequestCustTypesDtoList, refRequestCustTypesPage.getTotalElements()));
    }
    public ResponseEntity createRefRequestCustTypesHandler(RefRequestCustTypesDto refRequestCustTypesDto) {
        RefRequestCustTypes refRequestCustTypesCreated = refRequestCustTypesService.createEntity(refRequestCustTypesMapper.toEntity(refRequestCustTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refRequestCustTypesMapper.toDto(refRequestCustTypesCreated)));
    }

    public ResponseEntity updateRefRequestCustTypesHandler(RefRequestCustTypesDto refRequestCustTypesDto) {
        RefRequestCustTypes refRequestCustTypesCreated = refRequestCustTypesService.updateEntity(refRequestCustTypesMapper.toEntity(refRequestCustTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refRequestCustTypesMapper.toDto(refRequestCustTypesCreated)));
    }

    public ResponseEntity handleRefRequestCustTypesFindById(Integer refRequestCustTypesId) {
        RefRequestCustTypes refRequestCustTypes= refRequestCustTypesService.findById(refRequestCustTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refRequestCustTypesMapper.toDto(refRequestCustTypes)));
    }
    public ResponseEntity handleRefRequestCustTypesDeleteById(Integer refRequestCustTypesId) {
        refRequestCustTypesService.deleteEntity(refRequestCustTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }

}
