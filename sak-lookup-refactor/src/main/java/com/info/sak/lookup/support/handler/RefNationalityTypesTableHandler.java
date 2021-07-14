package com.info.sak.lookup.support.handler;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefNationalityTypesTable;
import com.info.sak.lookup.service.RefNationalityTypesTableService;
import com.info.sak.lookup.support.dto.RefNationalityTypesTableDto;
import com.info.sak.lookup.support.mapper.RefNationalityTypesTableMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefNationalityTypesTableHandler {

    private RefNationalityTypesTableMapper refNationalityTypesTableMapper;
    private RefNationalityTypesTableService refNationalityTypesTableService;
    private PageUtils<RefNationalityTypesTable> pageUtils;

    public ResponseEntity listRefNationalityTypesTableHandler() {
        List<RefNationalityTypesTable> refNationalityTypesTableList = refNationalityTypesTableService.listAll();
        List<RefNationalityTypesTableDto> refNationalityTypesTableDtoList = refNationalityTypesTableMapper.toDtoList(refNationalityTypesTableList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refNationalityTypesTableDtoList, (long) refNationalityTypesTableDtoList.size()));
    }

    public ResponseEntity listRefNationalityTypesTableHandler(int page, int size) {
        List<RefNationalityTypesTable> refNationalityTypesTableList = refNationalityTypesTableService.listAll();
        Page<RefNationalityTypesTable> refNationalityTypesTablePage = pageUtils.convertListToPage(refNationalityTypesTableList, page, size);
        List<RefNationalityTypesTableDto> refNationalityTypesTableDtoList = refNationalityTypesTableMapper.toDtoList(refNationalityTypesTablePage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refNationalityTypesTableDtoList, refNationalityTypesTablePage.getTotalElements()));
    }

    public ResponseEntity createRefNationalityTypesTableHandler(RefNationalityTypesTableDto refNationalityTypesDto) {
        RefNationalityTypesTable refNationalityTypesTableCreated = refNationalityTypesTableService.createEntity(refNationalityTypesTableMapper.toEntity(refNationalityTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refNationalityTypesTableMapper.toDto(refNationalityTypesTableCreated)));
    }

    public ResponseEntity updateRefNationalityTypesTableHandler(RefNationalityTypesTableDto refNationalityTypesTableDto) {
        RefNationalityTypesTable refNationalityTypesTableCreated = refNationalityTypesTableService.updateEntity(refNationalityTypesTableMapper.toEntity(refNationalityTypesTableDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refNationalityTypesTableMapper.toDto(refNationalityTypesTableCreated)));
    }

    public ResponseEntity handleRefNationalityTypesTableFindById(Integer refNationalityTypesTableId) {
        RefNationalityTypesTable refNationalityTypesTable = refNationalityTypesTableService.findById(refNationalityTypesTableId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refNationalityTypesTableMapper.toDto(refNationalityTypesTable)));
    }

    public ResponseEntity handleRefNationalityTypesTableDeleteById(Integer refNationalityTypesTableId) {
        refNationalityTypesTableService.deleteEntity(refNationalityTypesTableId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
