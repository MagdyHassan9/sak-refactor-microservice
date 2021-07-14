package com.info.sak.lookup.support.handler;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefParticpationType;
import com.info.sak.lookup.service.RefParticpationTypeService;
import com.info.sak.lookup.support.dto.RefParticpationTypeDto;
import com.info.sak.lookup.support.mapper.RefParticpationTypeMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefParticpationTypeHandler {

    private RefParticpationTypeMapper refParticpationTypeMapper;
    private RefParticpationTypeService refParticpationTypeService;
    private PageUtils<RefParticpationType> pageUtils;

    public ResponseEntity listRefParticpationTypeHandler() {
        List<RefParticpationType> refParticpationTypeList = refParticpationTypeService.listAll();
        List<RefParticpationTypeDto> refParticpationTypeDtoList = refParticpationTypeMapper.toDtoList(refParticpationTypeList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refParticpationTypeDtoList, (long) refParticpationTypeDtoList.size()));
    }

    public ResponseEntity listRefParticpationTypeHandler(int page, int size) {
        List<RefParticpationType> refParticpationTypeList = refParticpationTypeService.listAll();
        Page<RefParticpationType> refParticpationTypePage = pageUtils.convertListToPage(refParticpationTypeList, page, size);
        List<RefParticpationTypeDto> refParticpationTypeDtoList = refParticpationTypeMapper.toDtoList(refParticpationTypePage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refParticpationTypeDtoList, refParticpationTypePage.getTotalElements()));
    }

    public ResponseEntity createRefParticpationTypeHandler(RefParticpationTypeDto refParticpationTypeDto) {
        RefParticpationType refParticpationTypeCreated = refParticpationTypeService.createEntity(refParticpationTypeMapper.toEntity(refParticpationTypeDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refParticpationTypeMapper.toDto(refParticpationTypeCreated)));
    }

    public ResponseEntity updateRefParticpationTypeHandler(RefParticpationTypeDto refParticpationTypeDto) {
        RefParticpationType refParticpationTypeCreated = refParticpationTypeService.updateEntity(refParticpationTypeMapper.toEntity(refParticpationTypeDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refParticpationTypeMapper.toDto(refParticpationTypeCreated)));
    }

    public ResponseEntity handleRefParticpationTypeFindById(Integer refParticpationTypeId) {
        RefParticpationType refParticpationType= refParticpationTypeService.findById(refParticpationTypeId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refParticpationTypeMapper.toDto(refParticpationType)));
    }

    public ResponseEntity handleRefParticpationTypeDeleteById(Integer refParticpationTypeId) {
        refParticpationTypeService.deleteEntity(refParticpationTypeId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }



}
