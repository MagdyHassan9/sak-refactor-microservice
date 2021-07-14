package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefCustomerTypes;
import com.info.sak.lookup.service.RefCustomerTypesService;
import com.info.sak.lookup.support.dto.RefCustomerTypesDto;
import com.info.sak.lookup.support.mapper.RefCustomerTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefCustomerTypesHandler {
	private RefCustomerTypesMapper refCustomerTypesMapper;
	private RefCustomerTypesService refCustomerTypesService;
    private PageUtils<RefCustomerTypes> pageUtils;

    public ResponseEntity listRefCustomerTypesHandler() {
        List<RefCustomerTypes> customerTypesList = refCustomerTypesService.listAll();
        List<RefCustomerTypesDto> refCustomerTypesDtoList = refCustomerTypesMapper.toDtoList(customerTypesList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerTypesDtoList, (long) refCustomerTypesDtoList.size()));
    }
    
    public ResponseEntity listRefCustomerTypesHandler(int page, int size) {
        List<RefCustomerTypes> customerTypesList = refCustomerTypesService.listAll();
        Page<RefCustomerTypes> refCustomerTypesPage = pageUtils.convertListToPage(customerTypesList, page, size);
        List<RefCustomerTypesDto> refCustomerTypesDtoList = refCustomerTypesMapper.toDtoList(refCustomerTypesPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerTypesDtoList, refCustomerTypesPage.getTotalElements()));
    }
    
    public ResponseEntity createRefCustomerTypesHandler(RefCustomerTypesDto refCustomerTypesDto) {
    	RefCustomerTypes refCustomerTypesCreated = refCustomerTypesService.createEntity(refCustomerTypesMapper.toEntity(refCustomerTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerTypesMapper.toDto(refCustomerTypesCreated)));
    }
    
    public ResponseEntity updateRefCustomerTypesHandler(RefCustomerTypesDto refCustomerTypesDto) {
    	RefCustomerTypes refCustomerTypesCreated = refCustomerTypesService.updateEntity(refCustomerTypesMapper.toEntity(refCustomerTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerTypesMapper.toDto(refCustomerTypesCreated)));
    }
    
    public ResponseEntity handleRefCustomerTypesFindById(Integer refCustomerTypesId) {
    	RefCustomerTypes refCustomerTypes= refCustomerTypesService.findById(refCustomerTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerTypesMapper.toDto(refCustomerTypes)));
    }
    
    public ResponseEntity handleRefCustomerTypesDeleteById(Integer refCustomerTypesId) {
        refCustomerTypesService.deleteEntity(refCustomerTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
    
    
    
}

