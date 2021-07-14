package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.LookupRequestStatus;
import com.info.sak.lookup.service.LookupRequestStatusService;
import com.info.sak.lookup.support.dto.LookupRequestStatusDto;
import com.info.sak.lookup.support.mapper.LookupRequestStatusMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class LookupRequestStatusHandler {
    private LookupRequestStatusMapper requestStatusMapper;
    private LookupRequestStatusService requestStatusService;
    private PageUtils<LookupRequestStatus> pageUtils;


    public ResponseEntity list() {
        List<LookupRequestStatus> requestStatusList = requestStatusService.listAll();
        List<LookupRequestStatusDto> requestStatusDtoList = requestStatusMapper.toDtoList(requestStatusList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(requestStatusDtoList, (long) requestStatusDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        List<LookupRequestStatus> requestStatusList = requestStatusService.listAll();
        Page<LookupRequestStatus> lookupRequestStatusPage = pageUtils.convertListToPage(requestStatusList, page, size);
        List<LookupRequestStatusDto> requestStatusDtoList = requestStatusMapper.toDtoList(lookupRequestStatusPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(requestStatusDtoList, lookupRequestStatusPage.getTotalElements()));
    }

    public ResponseEntity create(LookupRequestStatusDto requestStatusDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                requestStatusMapper.toDto(requestStatusService.createEntity(requestStatusMapper.toEntity(requestStatusDto)))));
    }

    public ResponseEntity update(LookupRequestStatusDto requestStatusDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                requestStatusMapper.toDto(requestStatusService.updateEntity(requestStatusMapper.toEntity(requestStatusDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(requestStatusMapper.toDto(requestStatusService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        requestStatusService.deleteEntity(requestStatusService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }

}
