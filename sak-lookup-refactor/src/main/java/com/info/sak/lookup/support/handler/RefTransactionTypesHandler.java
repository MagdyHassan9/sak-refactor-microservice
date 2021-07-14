package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefTransactionTypes;
import com.info.sak.lookup.service.RefTransactionTypesService;
import com.info.sak.lookup.support.dto.RefTransactionTypesDto;
import com.info.sak.lookup.support.mapper.RefTransactionTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefTransactionTypesHandler {
    RefTransactionTypesMapper refTransactionTypesMapper;
    RefTransactionTypesService refTransactionTypesService;
    private PageUtils<RefTransactionTypes> pageUtils;
    public ResponseEntity listRefTransactionTypesHandler() {
        List<RefTransactionTypes> transactionTypesList = refTransactionTypesService.listAll();
        List<RefTransactionTypesDto> reftransactionTypesDtoList = refTransactionTypesMapper.toDtoList(transactionTypesList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(reftransactionTypesDtoList, (long) reftransactionTypesDtoList.size()));
    }
    public ResponseEntity listRefTransactionTypesHandler(int page, int size) {
        List<RefTransactionTypes> transactionTypesList = refTransactionTypesService.listAll();
        Page<RefTransactionTypes> refTransactionTypesPage = pageUtils.convertListToPage(transactionTypesList, page, size);
        List<RefTransactionTypesDto> refTransactionTypesDtoList = refTransactionTypesMapper.toDtoList(refTransactionTypesPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refTransactionTypesDtoList, refTransactionTypesPage.getTotalElements()));
    }
    public ResponseEntity createRefTransactionTypesHandler(RefTransactionTypesDto refTransactionTypesDto) {
        RefTransactionTypes refTransactionTypesCreated = refTransactionTypesService.createEntity(refTransactionTypesMapper.toEntity(refTransactionTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refTransactionTypesMapper.toDto(refTransactionTypesCreated)));
    }
    public ResponseEntity updateRefTransactionTypesHandler(RefTransactionTypesDto refTransactionTypesDto) {
        RefTransactionTypes refTransactionTypesCreated = refTransactionTypesService.updateEntity(refTransactionTypesMapper.toEntity(refTransactionTypesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refTransactionTypesMapper.toDto(refTransactionTypesCreated)));
    }


    public ResponseEntity handleRefTransactionTypesFindById(Integer refTransactionTypesId) {
        RefTransactionTypes refTransactionTypes= refTransactionTypesService.findById(refTransactionTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refTransactionTypesMapper.toDto(refTransactionTypes)));
    }
    public ResponseEntity handleRefTransactionTypesDeleteById(Integer refTransactionTypesId) {
        refTransactionTypesService.deleteEntity(refTransactionTypesId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
