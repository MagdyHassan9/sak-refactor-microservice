package com.info.sak.lookup.support.handler;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefTransactionCategory;
import com.info.sak.lookup.service.RefTransactionCategoryService;
import com.info.sak.lookup.support.dto.RefTransactionCategoryDto;
import com.info.sak.lookup.support.mapper.RefTransactionCategoryMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefTransactionCategoryHandler {
    RefTransactionCategoryMapper refTransactionCategoryMapper;
    RefTransactionCategoryService refTransactionCategoryService;
    private PageUtils<RefTransactionCategory> pageUtils;

    public ResponseEntity listRefTransactionCategoryHandler() {
        List<RefTransactionCategory> transactionCategoryList = refTransactionCategoryService.listAll();
        List<RefTransactionCategoryDto> refTransactionCategoryDtoList = refTransactionCategoryMapper.toDtoList(transactionCategoryList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refTransactionCategoryDtoList, (long) refTransactionCategoryDtoList.size()));
    }
    public ResponseEntity listRefTransactionCategoryHandler(int page, int size) {
        List<RefTransactionCategory> transactionCategoryList = refTransactionCategoryService.listAll();
        Page<RefTransactionCategory> refTransactionCategoryPage = pageUtils.convertListToPage(transactionCategoryList, page, size);
        List<RefTransactionCategoryDto> refTransactionCategoryDtoList = refTransactionCategoryMapper.toDtoList(refTransactionCategoryPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refTransactionCategoryDtoList, refTransactionCategoryPage.getTotalElements()));
    }
    public ResponseEntity createRefTransactionCategoryHandler(RefTransactionCategoryDto refTransactionCategoryDto) {
        RefTransactionCategory refTransactionCategoryCreated = refTransactionCategoryService.createEntity(refTransactionCategoryMapper.toEntity(refTransactionCategoryDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refTransactionCategoryMapper.toDto(refTransactionCategoryCreated)));
    }

    public ResponseEntity updateRefTransactionCategoryHandler(RefTransactionCategoryDto refTransactionCategoryDto) {
        RefTransactionCategory refTransactionCategoryCreated = refTransactionCategoryService.updateEntity(refTransactionCategoryMapper.toEntity(refTransactionCategoryDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refTransactionCategoryMapper.toDto(refTransactionCategoryCreated)));
    }

    public ResponseEntity handleRefTransactionCategoryFindById(Integer refTransactionCategoryId) {
        RefTransactionCategory refTransactionCategory= refTransactionCategoryService.findById(refTransactionCategoryId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refTransactionCategoryMapper.toDto(refTransactionCategory)));
    }
    public ResponseEntity handleRefTransactionCategoryDeleteById(Integer refTransactionCategoryId) {
        refTransactionCategoryService.deleteEntity(refTransactionCategoryId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }

}
