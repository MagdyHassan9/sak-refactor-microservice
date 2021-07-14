package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefRequestSource;
import com.info.sak.lookup.service.RefRequestSourceService;
import com.info.sak.lookup.support.dto.RefRequestSourceDto;
import com.info.sak.lookup.support.mapper.RefRequestSourceMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefRequestSourceHandler {

    private RefRequestSourceService refRequestSourceService;
    private RefRequestSourceMapper refRequestSourceMapper;
    private PageUtils<RefRequestSource> pageUtils;

    public ResponseEntity list() {
        List<RefRequestSource> refRequestSourceList = refRequestSourceService.listAll();
        List<RefRequestSourceDto> refRequestSourceDtoList = refRequestSourceMapper.toDtoList(refRequestSourceList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refRequestSourceDtoList, (long) refRequestSourceDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        List<RefRequestSource> refRequestSources = refRequestSourceService.listAll();
        Page<RefRequestSource> requestSourcePage = pageUtils.convertListToPage(refRequestSources, page, size);
        List<RefRequestSourceDto> requestSourceDtoList = refRequestSourceMapper.toDtoList(requestSourcePage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(requestSourceDtoList, requestSourcePage.getTotalElements()));
    }

    public ResponseEntity create(RefRequestSourceDto requestSourceDto) {
        RefRequestSource requestSource = refRequestSourceService.createEntity(refRequestSourceMapper.toEntity(requestSourceDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refRequestSourceMapper.toDto(requestSource)));
    }

    public ResponseEntity update(RefRequestSourceDto requestSourceDto) {
        RefRequestSource requestSource = refRequestSourceService.updateEntity(refRequestSourceMapper.toEntity(requestSourceDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refRequestSourceMapper.toDto(requestSource)));
    }

    public ResponseEntity findById(Integer entityId) {
        RefRequestSource requestSource = refRequestSourceService.findById(entityId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refRequestSourceMapper.toDto(requestSource)));
    }

    public ResponseEntity delete(Integer entityId) {
        refRequestSourceService.deleteEntity(entityId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }


}
