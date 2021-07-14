package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefPeriod;
import com.info.sak.lookup.service.RefPeriodService;
import com.info.sak.lookup.support.dto.RefPeriodDto;
import com.info.sak.lookup.support.mapper.RefPeriodMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefPeriodHandler {
    private RefPeriodService periodService;
    private RefPeriodMapper periodMapper;
    private PageUtils<RefPeriod> pageUtils;


    public ResponseEntity list() {
        List<RefPeriodDto> periodDtoList = periodMapper.toDtoList(periodService.listAll());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(periodDtoList, (long) periodDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        Page<RefPeriod> periodPage = pageUtils.convertListToPage(periodService.listAll(), page, size);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(periodMapper.toDtoList(periodPage.getContent()), periodPage.getTotalElements()));
    }

    public ResponseEntity create(RefPeriodDto periodDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                periodMapper.toDto(periodService.createEntity(periodMapper.toEntity(periodDto)))));
    }

    public ResponseEntity update(RefPeriodDto periodDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                periodMapper.toDto(periodService.updateEntity(periodMapper.toEntity(periodDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(periodMapper.toDto(periodService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        periodService.deleteEntity(periodService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
