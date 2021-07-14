package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefTransactionCustTypes;
import com.info.sak.lookup.service.RefTransactionCustTypesService;
import com.info.sak.lookup.support.dto.RefTransactionCustTypesDto;
import com.info.sak.lookup.support.mapper.RefTransactionCustTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefTransactionCustTypesHandler {

    private RefTransactionCustTypesService transactionCustTypesService;
    private RefTransactionCustTypesMapper transactionCustTypesMapper;
    private PageUtils<RefTransactionCustTypes> pageUtils;


    public ResponseEntity list() {
        List<RefTransactionCustTypesDto> refTransactionCustTypesDtoList = transactionCustTypesMapper.toDtoList(transactionCustTypesService.listAll());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refTransactionCustTypesDtoList, (long) refTransactionCustTypesDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        Page<RefTransactionCustTypes> transactionCustTypesPage = pageUtils.convertListToPage(transactionCustTypesService.listAll(), page, size);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(transactionCustTypesMapper.toDtoList(transactionCustTypesPage.getContent()), transactionCustTypesPage.getTotalElements()));
    }

    public ResponseEntity create(RefTransactionCustTypesDto transactionCustTypesDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                transactionCustTypesMapper.toDto(transactionCustTypesService.createEntity(transactionCustTypesMapper.toEntity(transactionCustTypesDto)))));
    }

    public ResponseEntity update(RefTransactionCustTypesDto transactionCustTypesDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                transactionCustTypesMapper.toDto(transactionCustTypesService.updateEntity(transactionCustTypesMapper.toEntity(transactionCustTypesDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(transactionCustTypesMapper.toDto(transactionCustTypesService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        transactionCustTypesService.deleteEntity(transactionCustTypesService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
