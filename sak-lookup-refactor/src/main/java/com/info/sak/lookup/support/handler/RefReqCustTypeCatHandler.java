package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefReqCustTypeCat;
import com.info.sak.lookup.service.RefReqCustTypeCatService;
import com.info.sak.lookup.support.dto.RefReqCustTypeCatDto;
import com.info.sak.lookup.support.mapper.RefReqCustTypesCatMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefReqCustTypeCatHandler {
    RefReqCustTypesCatMapper refReqCustTypeCatMapper;
    RefReqCustTypeCatService refReqCustTypeCatService;
    private PageUtils<RefReqCustTypeCat> pageUtils;
    public ResponseEntity listRefReqCustTypeCatHandler() {
        List<RefReqCustTypeCat> reqCustTypeCatList = refReqCustTypeCatService.listAll();
        List<RefReqCustTypeCatDto> refReqCustTypeCatDtoList = refReqCustTypeCatMapper.toDtoList(reqCustTypeCatList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refReqCustTypeCatDtoList, (long) refReqCustTypeCatDtoList.size()));
    }
    public ResponseEntity listRefReqCustTypeCatHandler(int page, int size) {
        List<RefReqCustTypeCat> reqCustTypeCatList = refReqCustTypeCatService.listAll();
        Page<RefReqCustTypeCat> refReqCustTypeCatPage = pageUtils.convertListToPage(reqCustTypeCatList, page, size);
        List<RefReqCustTypeCatDto> refReqCustTypeCatDtoList = refReqCustTypeCatMapper.toDtoList(refReqCustTypeCatPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refReqCustTypeCatDtoList, refReqCustTypeCatPage.getTotalElements()));
    }
    public ResponseEntity createRefReqCustTypeCatHandler(RefReqCustTypeCatDto refReqCustTypeCatDto) {
        RefReqCustTypeCat refReqCustTypeCatCreated = refReqCustTypeCatService.createEntity(refReqCustTypeCatMapper.toEntity(refReqCustTypeCatDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refReqCustTypeCatMapper.toDto(refReqCustTypeCatCreated)));
    }

    public ResponseEntity updateRefReqCustTypeCatHandler(RefReqCustTypeCatDto refReqCustTypeCatDto) {
        RefReqCustTypeCat refReqCustTypeCatCreated = refReqCustTypeCatService.updateEntity(refReqCustTypeCatMapper.toEntity(refReqCustTypeCatDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refReqCustTypeCatMapper.toDto(refReqCustTypeCatCreated)));
    }

    public ResponseEntity handleRefReqCustTypeCatFindById(Integer refReqCustTypeCatId) {
        RefReqCustTypeCat refReqCustTypeCat= refReqCustTypeCatService.findById(refReqCustTypeCatId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refReqCustTypeCatMapper.toDto(refReqCustTypeCat)));
    }
    public ResponseEntity handleRefReqCustTypeCatDeleteById(Integer refReqCustTypeCatId) {
        refReqCustTypeCatService.deleteEntity(refReqCustTypeCatId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
