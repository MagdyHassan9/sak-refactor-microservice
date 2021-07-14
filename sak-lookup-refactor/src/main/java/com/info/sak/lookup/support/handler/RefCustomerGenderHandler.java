package com.info.sak.lookup.support.handler;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefCustomerGender;
import com.info.sak.lookup.service.RefCustomerGenderService;
import com.info.sak.lookup.support.dto.RefCustomerGenderDto;
import com.info.sak.lookup.support.mapper.RefCustomerGenderMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefCustomerGenderHandler {
	private RefCustomerGenderMapper refCustomerGenderMapper;
	private RefCustomerGenderService refCustomerGenderService;
    private PageUtils<RefCustomerGender> pageUtils;

    public ResponseEntity listRefCustomerGenderHandler() {
        List<RefCustomerGender> customerGenderList = refCustomerGenderService.listAll();
        List<RefCustomerGenderDto> refCustomerGenderDtoList = refCustomerGenderMapper.toDtoList(customerGenderList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerGenderDtoList, (long) refCustomerGenderDtoList.size()));
    }
    
    public ResponseEntity listRefCustomerGenderHandler(int page, int size) {
        List<RefCustomerGender> customerGenderList = refCustomerGenderService.listAll();
        Page<RefCustomerGender> refCustomerGenderPage = pageUtils.convertListToPage(customerGenderList, page, size);
        List<RefCustomerGenderDto> refCustomerGenderDtoList = refCustomerGenderMapper.toDtoList(refCustomerGenderPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustomerGenderDtoList, refCustomerGenderPage.getTotalElements()));
    }
    
    public ResponseEntity createRefCustomerGenderHandler(RefCustomerGenderDto refCustomerGenderDto) {
    	RefCustomerGender refCustomerGenderCreated = refCustomerGenderService.createEntity(refCustomerGenderMapper.toEntity(refCustomerGenderDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerGenderMapper.toDto(refCustomerGenderCreated)));
    }
    
    public ResponseEntity updateRefCustomerGenderHandler(RefCustomerGenderDto refCustomerGenderDto) {
    	RefCustomerGender refCustomerGenderCreated = refCustomerGenderService.updateEntity(refCustomerGenderMapper.toEntity(refCustomerGenderDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerGenderMapper.toDto(refCustomerGenderCreated)));
    }
    
    public ResponseEntity handleRefCustomerGenderFindById(Integer refCustomerGenderId) {
    	RefCustomerGender refCustomerGender= refCustomerGenderService.findById(refCustomerGenderId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustomerGenderMapper.toDto(refCustomerGender)));
    }
    
    public ResponseEntity handleRefCustomerGenderDeleteById(Integer refCustomerGenderId) {
        refCustomerGenderService.deleteEntity(refCustomerGenderId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
    
    
    
}
