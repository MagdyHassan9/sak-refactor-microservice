package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefCustCats;
import com.info.sak.lookup.service.RefCustCatsService;
import com.info.sak.lookup.support.dto.RefCustCatsDto;
import com.info.sak.lookup.support.mapper.RefCustCatsMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefCustCatsHandler {
	private RefCustCatsMapper refCustCatsMapper;
	private RefCustCatsService refCustCatsService;
    private PageUtils<RefCustCats> pageUtils;

    public ResponseEntity listRefCustCatsHandler() {
        List<RefCustCats> CustCatsList = refCustCatsService.listAll();
        List<RefCustCatsDto> refCustCatsDtoList = refCustCatsMapper.toDtoList(CustCatsList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustCatsDtoList, (long) refCustCatsDtoList.size()));
    }
    
    public ResponseEntity listRefCustCatsHandler(int page, int size) {
        List<RefCustCats> CustCatsList = refCustCatsService.listAll();
        Page<RefCustCats> refCustCatsPage = pageUtils.convertListToPage(CustCatsList, page, size);
        List<RefCustCatsDto> refCustCatsDtoList = refCustCatsMapper.toDtoList(refCustCatsPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refCustCatsDtoList, refCustCatsPage.getTotalElements()));
    }
    
    public ResponseEntity createRefCustCatsHandler(RefCustCatsDto refCustCatsDto) {
    	RefCustCats refCustCatsCreated = refCustCatsService.createEntity(refCustCatsMapper.toEntity(refCustCatsDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustCatsMapper.toDto(refCustCatsCreated)));
    }
    
    public ResponseEntity updateRefCustCatsHandler(RefCustCatsDto refCustCatsDto) {
    	RefCustCats refCustCatsCreated = refCustCatsService.updateEntity(refCustCatsMapper.toEntity(refCustCatsDto));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustCatsMapper.toDto(refCustCatsCreated)));
    }
    
    public ResponseEntity handleRefCustCatsFindById(Integer refCustCatsId) {
    	RefCustCats refCustCats= refCustCatsService.findById(refCustCatsId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refCustCatsMapper.toDto(refCustCats)));
    }
    
    public ResponseEntity handleRefCustCatsDeleteById(Integer refCustCatsId) {
        refCustCatsService.deleteEntity(refCustCatsId);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
    
    
    
}
