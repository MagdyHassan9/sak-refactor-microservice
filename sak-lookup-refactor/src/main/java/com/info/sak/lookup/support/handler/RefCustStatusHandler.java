package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefCustStatus;
import com.info.sak.lookup.service.RefCustStatusService;
import com.info.sak.lookup.support.dto.RefCustStatusDto;
import com.info.sak.lookup.support.mapper.RefCustStatusMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefCustStatusHandler {
private RefCustStatusMapper refCustStatusMapper;
private RefCustStatusService refCustStatusService;
private PageUtils<RefCustStatus> pageUtils;

public ResponseEntity listRefCustStatusHandler() {
    List<RefCustStatus> CustStatusList = refCustStatusService.listAll();
    List<RefCustStatusDto> refCustStatusDtoList = refCustStatusMapper.toDtoList(CustStatusList);
    return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustStatusDtoList, (long) refCustStatusDtoList.size()));
}

public ResponseEntity listRefCustStatusHandler(int page, int size) {
    List<RefCustStatus> CustStatusList = refCustStatusService.listAll();
    Page<RefCustStatus> refCustStatusPage = pageUtils.convertListToPage(CustStatusList, page, size);
    List<RefCustStatusDto> refCustStatusDtoList = refCustStatusMapper.toDtoList(refCustStatusPage.getContent());
    return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustStatusDtoList, refCustStatusPage.getTotalElements()));
}

public ResponseEntity createRefCustStatusHandler(RefCustStatusDto refCustStatusDto) {
	RefCustStatus refCustStatusCreated = refCustStatusService.createEntity(refCustStatusMapper.toEntity(refCustStatusDto));
    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustStatusMapper.toDto(refCustStatusCreated)));
}

public ResponseEntity updateRefCustStatusHandler(RefCustStatusDto refCustStatusDto) {
	RefCustStatus refCustStatusCreated = refCustStatusService.updateEntity(refCustStatusMapper.toEntity(refCustStatusDto));
    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustStatusMapper.toDto(refCustStatusCreated)));
}

public ResponseEntity handleRefCustStatusFindById(Integer refCustStatusId) {
	RefCustStatus refCustStatus= refCustStatusService.findById(refCustStatusId);
    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustStatusMapper.toDto(refCustStatus)));
}

public ResponseEntity handleRefCustStatusDeleteById(Integer refCustStatusId) {
    refCustStatusService.deleteEntity(refCustStatusId);
    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
}



}
