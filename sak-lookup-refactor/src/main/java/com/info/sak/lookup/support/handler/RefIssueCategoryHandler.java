package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefIssueCategory;
import com.info.sak.lookup.service.RefIssueCategoryService;
import com.info.sak.lookup.support.dto.RefIssueCategoryDto;
import com.info.sak.lookup.support.mapper.RefIssueCategoryMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefIssueCategoryHandler {

	private RefIssueCategoryMapper refIssueCategoryMapper;
	private RefIssueCategoryService refIssueCategoryService;
    private PageUtils<RefIssueCategory> pageUtils;

    public ResponseEntity listRefIssueCategoryHandler() {
        List<RefIssueCategory> refIssueCategoryList = refIssueCategoryService.listAll();
        List<RefIssueCategoryDto> refIssueCategoryDtoList = refIssueCategoryMapper.toDtoList(refIssueCategoryList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refIssueCategoryDtoList, (long) refIssueCategoryDtoList.size()));
    }
    
    public ResponseEntity listRefIssueCategoryHandler(int page, int size) {
        List<RefIssueCategory> refIssueCategoryList = refIssueCategoryService.listAll();
        Page<RefIssueCategory> refIssueCategoryPage = pageUtils.convertListToPage(refIssueCategoryList, page, size);
        List<RefIssueCategoryDto> refIssueCategoryDtoList = refIssueCategoryMapper.toDtoList(refIssueCategoryPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refIssueCategoryDtoList, refIssueCategoryPage.getTotalElements()));
    }
    
    public ResponseEntity createRefIssueCategoryHandler(RefIssueCategoryDto refIssueCategoryDto) {
    	RefIssueCategory refIssueCategoryCreated = refIssueCategoryService.createEntity(refIssueCategoryMapper.toEntity(refIssueCategoryDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refIssueCategoryMapper.toDto(refIssueCategoryCreated)));
    }
    
    public ResponseEntity updateRefIssueCategoryHandler(RefIssueCategoryDto refIssueCategoryDto) {
    	RefIssueCategory refIssueCategoryCreated = refIssueCategoryService.updateEntity(refIssueCategoryMapper.toEntity(refIssueCategoryDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refIssueCategoryMapper.toDto(refIssueCategoryCreated)));
    }
    
    public ResponseEntity handleRefIssueCategoryFindById(Integer refIssueCategoryId) {
    	RefIssueCategory refCustomerGender= refIssueCategoryService.findById(refIssueCategoryId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refIssueCategoryMapper.toDto(refCustomerGender)));
    }
    
    public ResponseEntity handleRefIssueCategoryDeleteById(Integer refIssueCategoryId) {
        refIssueCategoryService.deleteEntity(refIssueCategoryId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}

