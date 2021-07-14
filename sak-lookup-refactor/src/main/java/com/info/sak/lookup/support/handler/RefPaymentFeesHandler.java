package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefPaymentFees;
import com.info.sak.lookup.service.RefPaymentFeesService;
import com.info.sak.lookup.support.dto.RefPaymentFeesDto;
import com.info.sak.lookup.support.mapper.RefPaymentFeesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefPaymentFeesHandler {
    private RefPaymentFeesService paymentFeesService;
    private RefPaymentFeesMapper paymentFeesMapper;
    private PageUtils<RefPaymentFees> pageUtils;

    public ResponseEntity list() {
        List<RefPaymentFees> refRequestSourceList = paymentFeesService.listAll();
        List<RefPaymentFeesDto> paymentFeesDtoList = paymentFeesMapper.toDtoList(refRequestSourceList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(paymentFeesDtoList, (long) paymentFeesDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        List<RefPaymentFees> paymentFeesList = paymentFeesService.listAll();
        Page<RefPaymentFees> paymentFeesPage = pageUtils.convertListToPage(paymentFeesList, page, size);
        List<RefPaymentFeesDto> requestSourceDtoList = paymentFeesMapper.toDtoList(paymentFeesPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(requestSourceDtoList, paymentFeesPage.getTotalElements()));
    }

    public ResponseEntity create(RefPaymentFeesDto paymentFeesDto) {
        RefPaymentFees paymentFees = paymentFeesService.createEntity(paymentFeesMapper.toEntity(paymentFeesDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(paymentFeesMapper.toDto(paymentFees)));
    }

    public ResponseEntity update(RefPaymentFeesDto paymentFeesDto) {
        return ResponseEntity.status(HttpStatus.OK).body(
                new SuccessResponse(paymentFeesMapper.toDto(paymentFeesService.updateEntity(paymentFeesMapper.toEntity(paymentFeesDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(paymentFeesMapper.toDto(paymentFeesService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        paymentFeesService.deleteEntity(entityId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}