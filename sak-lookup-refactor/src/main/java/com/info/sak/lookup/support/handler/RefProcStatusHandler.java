package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefProcStatus;
import com.info.sak.lookup.service.RefProcStatusService;
import com.info.sak.lookup.support.dto.RefProcStatusDto;
import com.info.sak.lookup.support.mapper.RefProcStatusMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefProcStatusHandler {
    private RefProcStatusService procStatusService;
    private RefProcStatusMapper procStatusMapper;
    private PageUtils<RefProcStatus> pageUtils;


    public ResponseEntity list() {
        List<RefProcStatusDto> refProcStatusDtoList = procStatusMapper.toDtoList(procStatusService.listAll());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refProcStatusDtoList, (long) refProcStatusDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        Page<RefProcStatus> procStatusPage = pageUtils.convertListToPage(procStatusService.listAll(), page, size);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(procStatusMapper.toDtoList(procStatusPage.getContent()), procStatusPage.getTotalElements()));
    }

    public ResponseEntity create(RefProcStatusDto procStatusDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                procStatusMapper.toDto(procStatusService.createEntity(procStatusMapper.toEntity(procStatusDto)))));
    }

    public ResponseEntity update(RefProcStatusDto procStatusDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                procStatusMapper.toDto(procStatusService.updateEntity(procStatusMapper.toEntity(procStatusDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(procStatusMapper.toDto(procStatusService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        procStatusService.deleteEntity(procStatusService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
