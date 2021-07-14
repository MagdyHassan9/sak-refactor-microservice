package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.LookupReviewerType;
import com.info.sak.lookup.service.LookupReviewerTypeService;
import com.info.sak.lookup.support.dto.LookupReviewerTypeDto;
import com.info.sak.lookup.support.mapper.LookupReviewerTypeMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class LookupReviewerTypeHandler {
    private LookupReviewerTypeMapper reviewerTypeMapper;
    private LookupReviewerTypeService reviewerTypeService;
    private PageUtils<LookupReviewerType> pageUtils;


    public ResponseEntity list() {
        List<LookupReviewerType> lookupReviewerTypeList = reviewerTypeService.listAll();
        List<LookupReviewerTypeDto> lookupReviewerTypeDtoList = reviewerTypeMapper.toDtoList(lookupReviewerTypeList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(lookupReviewerTypeDtoList, (long) lookupReviewerTypeDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        List<LookupReviewerType> reviewerTypeList = reviewerTypeService.listAll();
        Page<LookupReviewerType> reviewerTypeDtoPage = pageUtils.convertListToPage(reviewerTypeList, page, size);
        List<LookupReviewerTypeDto> reviewerTypeDtoList = reviewerTypeMapper.toDtoList(reviewerTypeDtoPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(reviewerTypeDtoList, reviewerTypeDtoPage.getTotalElements()));
    }

    public ResponseEntity create(LookupReviewerTypeDto reviewerTypeDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                reviewerTypeMapper.toDto(reviewerTypeService.createEntity(reviewerTypeMapper.toEntity(reviewerTypeDto)))));
    }

    public ResponseEntity update(LookupReviewerTypeDto reviewerTypeDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                reviewerTypeMapper.toDto(reviewerTypeService.updateEntity(reviewerTypeMapper.toEntity(reviewerTypeDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(reviewerTypeMapper.toDto(reviewerTypeService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        reviewerTypeService.deleteEntity(entityId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
