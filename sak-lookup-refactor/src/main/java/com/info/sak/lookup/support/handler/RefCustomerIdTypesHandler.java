package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefCustomerIdTypes;
import com.info.sak.lookup.service.RefCustomerIdTypesService;
import com.info.sak.lookup.support.dto.RefCustomerIdTypesDto;
import com.info.sak.lookup.support.mapper.RefCustomerIdTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefCustomerIdTypesHandler {
	private RefCustomerIdTypesMapper refCustomerIdTypesMapper;
	private RefCustomerIdTypesService refCustomerIdTypesService;
    private PageUtils<RefCustomerIdTypes> pageUtils;
    public ResponseEntity listRefCustomerIdTypesHandler() {
        List<RefCustomerIdTypes> refCustomerIdTypesList = refCustomerIdTypesService.listAll();
        List<RefCustomerIdTypesDto> refCustomerIdTypesDtoList = refCustomerIdTypesMapper.toDtoList(refCustomerIdTypesList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerIdTypesDtoList, (long) refCustomerIdTypesList.size()));
    }
    
    public ResponseEntity listRefCustomerIdTypesHandler(int page, int size) {
        List<RefCustomerIdTypes> refCustomerIdTypesList = refCustomerIdTypesService.listAll();
        Page<RefCustomerIdTypes> refCustomerIdTypesPage = pageUtils.convertListToPage(refCustomerIdTypesList, page, size);
        List<RefCustomerIdTypesDto> refCustomerIdTypesDtoList =refCustomerIdTypesMapper.toDtoList(refCustomerIdTypesPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerIdTypesDtoList, refCustomerIdTypesPage.getTotalElements()));
    }
    
    public ResponseEntity createRefCustomerIdTypesHandler(RefCustomerIdTypesDto refCustomerIdTypesDto) {
    	RefCustomerIdTypes refCustomerIdTypes = refCustomerIdTypesService.createEntity(refCustomerIdTypesMapper.toEntity(refCustomerIdTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerIdTypesMapper.toDto(refCustomerIdTypes)));
    }
    
    public ResponseEntity updateRefCustomerIdTypesHandler(RefCustomerIdTypesDto refCustomerIdTypesDto) {
    	RefCustomerIdTypes refCustomerIdTypes = refCustomerIdTypesService.updateEntity(refCustomerIdTypesMapper.toEntity(refCustomerIdTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerIdTypesMapper.toDto(refCustomerIdTypes)));
    }
    
    public ResponseEntity handleRefCustomerIdTypesFindById(Integer refCustomerIdTypesId) {
    	RefCustomerIdTypes refCustomerIdTypes= refCustomerIdTypesService.findById(refCustomerIdTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerIdTypesMapper.toDto(refCustomerIdTypes)));
    }
    
    public ResponseEntity handleRefCustomerIdTypesDeleteById(Integer refCustomerIdTypesId) {
    	refCustomerIdTypesService.deleteEntity(refCustomerIdTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
    
    
    

	

}
