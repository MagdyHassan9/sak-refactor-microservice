package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefGovernments;
import com.info.sak.lookup.service.RefGovernmentsService;
import com.info.sak.lookup.support.dto.RefGovernmentsDto;
import com.info.sak.lookup.support.mapper.RefGovernmentsMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefGovernmentsHandler {
	private RefGovernmentsMapper refGovernmentsMapper;
	private RefGovernmentsService refGovernmentsService;
    private PageUtils<RefGovernments> pageUtils;

    public ResponseEntity listRefGovernmentsHandler() {
        List<RefGovernments> governmentsList = refGovernmentsService.listAll();
        List<RefGovernmentsDto> refGovernmentsDtoList = refGovernmentsMapper.toDtoList(governmentsList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refGovernmentsDtoList, (long) refGovernmentsDtoList.size()));
    }
    
    public ResponseEntity listRefGovernmentsHandler(int page, int size) {
        List<RefGovernments> governmentsList = refGovernmentsService.listAll();
        Page<RefGovernments> refGovernmentsPage = pageUtils.convertListToPage(governmentsList, page, size);
        List<RefGovernmentsDto> refGovernmentsDtoList = refGovernmentsMapper.toDtoList(refGovernmentsPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refGovernmentsDtoList, refGovernmentsPage.getTotalElements()));
    }
    
    public ResponseEntity createRefGovernmentsHandler(RefGovernmentsDto refGovernmentsDto) {
    	RefGovernments refGovernmentsCreated = refGovernmentsService.createEntity(refGovernmentsMapper.toEntity(refGovernmentsDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refGovernmentsMapper.toDto(refGovernmentsCreated)));
    }
    
    public ResponseEntity updateRefGovernmentsHandler(RefGovernmentsDto refGovernmentsDto) {
    	RefGovernments refGovernmentsCreated = refGovernmentsService.updateEntity(refGovernmentsMapper.toEntity(refGovernmentsDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refGovernmentsMapper.toDto(refGovernmentsCreated)));
    }
    
    public ResponseEntity handleRefGovernmentsFindById(Integer refGovernmentsId) {
    	RefGovernments refGovernments= refGovernmentsService.findById(refGovernmentsId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refGovernmentsMapper.toDto(refGovernments)));
    }
    
    public ResponseEntity handleRefGovernmentsDeleteById(Integer refGovernmentsId) {
        refGovernmentsService.deleteEntity(refGovernmentsId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
    
    
    
}
