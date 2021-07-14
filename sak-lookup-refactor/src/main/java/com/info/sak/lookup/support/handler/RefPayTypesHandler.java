package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefPayTypes;
import com.info.sak.lookup.service.RefPayTypesService;
import com.info.sak.lookup.support.dto.RefPayTypesDto;
import com.info.sak.lookup.support.mapper.RefPayTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefPayTypesHandler {
    private RefPayTypesService payTypesService;
    private RefPayTypesMapper payTypesMapper;
    private PageUtils<RefPayTypes> pageUtils;


    public ResponseEntity list() {
        List<RefPayTypesDto> payTypesDtoList = payTypesMapper.toDtoList(payTypesService.listAll());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(payTypesDtoList, (long) payTypesDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        Page<RefPayTypes> payTypesPage = pageUtils.convertListToPage(payTypesService.listAll(), page, size);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(payTypesMapper.toDtoList(payTypesPage.getContent()), payTypesPage.getTotalElements()));
    }

    public ResponseEntity create(RefPayTypesDto payTypesDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                payTypesMapper.toDto(payTypesService.createEntity(payTypesMapper.toEntity(payTypesDto)))));
    }

    public ResponseEntity update(RefPayTypesDto payTypesDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                payTypesMapper.toDto(payTypesService.updateEntity(payTypesMapper.toEntity(payTypesDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(payTypesMapper.toDto(payTypesService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        payTypesService.deleteEntity(payTypesService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }

}
