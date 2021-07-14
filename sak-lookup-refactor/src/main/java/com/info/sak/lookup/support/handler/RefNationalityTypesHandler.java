package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefNationalityTypes;
import com.info.sak.lookup.service.RefNationalityTypesService;
import com.info.sak.lookup.support.dto.RefNationalityTypesDto;
import com.info.sak.lookup.support.mapper.RefNationalityTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefNationalityTypesHandler {

	private RefNationalityTypesMapper refNationalityTypesMapper;
	private RefNationalityTypesService refNationalityTypesService;
    private PageUtils<RefNationalityTypes> pageUtils;

    public ResponseEntity listRefNationalityTypesHandler() {
        List<RefNationalityTypes> refNationalityTypesList = refNationalityTypesService.listAll();
        List<RefNationalityTypesDto> refNationalityTypesDtoList = refNationalityTypesMapper.toDtoList(refNationalityTypesList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refNationalityTypesDtoList, (long) refNationalityTypesDtoList.size()));
    }
    
    public ResponseEntity listRefNationalityTypesHandler(int page, int size) {
        List<RefNationalityTypes> refNationalityTypesList = refNationalityTypesService.listAll();
        Page<RefNationalityTypes> refNationalityTypesPage = pageUtils.convertListToPage(refNationalityTypesList, page, size);
        List<RefNationalityTypesDto> refNationalityTypesDtoList = refNationalityTypesMapper.toDtoList(refNationalityTypesPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refNationalityTypesDtoList, refNationalityTypesPage.getTotalElements()));
    }
    
    public ResponseEntity createRefNationalityTypesHandler(RefNationalityTypesDto refNationalityTypesDto) {
    	RefNationalityTypes refNationalityTypesCreated = refNationalityTypesService.createEntity(refNationalityTypesMapper.toEntity(refNationalityTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refNationalityTypesMapper.toDto(refNationalityTypesCreated)));
    }
    
    public ResponseEntity updateRefNationalityTypesHandler(RefNationalityTypesDto refNationalityTypesDto) {
    	RefNationalityTypes refNationalityTypesCreated = refNationalityTypesService.updateEntity(refNationalityTypesMapper.toEntity(refNationalityTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refNationalityTypesMapper.toDto(refNationalityTypesCreated)));
    }
    
    public ResponseEntity handleRefNationalityTypesFindById(Integer refNationalityTypesId) {
    	RefNationalityTypes refNationalityTypes= refNationalityTypesService.findById(refNationalityTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refNationalityTypesMapper.toDto(refNationalityTypes)));
    }
    
    public ResponseEntity handleRefNationalityTypesDeleteById(Integer refNationalityTypesId) {
        refNationalityTypesService.deleteEntity(refNationalityTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}

