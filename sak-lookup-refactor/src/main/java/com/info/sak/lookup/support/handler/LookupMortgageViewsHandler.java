package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.LookupMortgageViews;
import com.info.sak.lookup.service.LookupMortgageViewsService;
import com.info.sak.lookup.support.dto.LookupMortgageViewsDto;
import com.info.sak.lookup.support.mapper.LookupMortgageViewsMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class LookupMortgageViewsHandler {
    private LookupMortgageViewsService mortgageViewsService;
    private LookupMortgageViewsMapper mortgageViewsMapper;
    private PageUtils<LookupMortgageViews> pageUtils;


    public ResponseEntity list() {
        List<LookupMortgageViews> lookupMortgageViewsList = mortgageViewsService.listAll();
        List<LookupMortgageViewsDto> mortgageViewsDtoList = mortgageViewsMapper.toDtoList(lookupMortgageViewsList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(mortgageViewsDtoList, (long) mortgageViewsDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        List<LookupMortgageViews> lookupMortgageViewsList = mortgageViewsService.listAll();
        Page<LookupMortgageViews> mortgageViewsPage = pageUtils.convertListToPage(lookupMortgageViewsList, page, size);
        List<LookupMortgageViewsDto> mortgageViewsDtoList = mortgageViewsMapper.toDtoList(mortgageViewsPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(mortgageViewsDtoList, mortgageViewsPage.getTotalElements()));
    }

    public ResponseEntity create(LookupMortgageViewsDto mortgageViewsDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                mortgageViewsMapper.toDto(mortgageViewsService.createEntity(mortgageViewsMapper.toEntity(mortgageViewsDto)))));
    }

    public ResponseEntity update(LookupMortgageViewsDto mortgageViewsDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                mortgageViewsMapper.toDto(mortgageViewsService.updateEntity(mortgageViewsMapper.toEntity(mortgageViewsDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(mortgageViewsMapper.toDto(mortgageViewsService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        mortgageViewsService.deleteEntity(mortgageViewsService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
