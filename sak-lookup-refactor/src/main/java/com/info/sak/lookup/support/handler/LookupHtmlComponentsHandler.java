package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.LookupHtmlComponents;
import com.info.sak.lookup.service.LookupHtmlComponentsService;
import com.info.sak.lookup.support.dto.LookupHtmlComponentsDto;
import com.info.sak.lookup.support.mapper.LookupHtmlComponentsMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class LookupHtmlComponentsHandler {
    private LookupHtmlComponentsService htmlComponentsService;
    private LookupHtmlComponentsMapper htmlComponentsMapper;
    private PageUtils<LookupHtmlComponents> pageUtils;


    public ResponseEntity list() {
        List<LookupHtmlComponents> htmlComponentsList = htmlComponentsService.listAll();
        List<LookupHtmlComponentsDto> lookupHtmlComponentsDtoList = htmlComponentsMapper.toDtoList(htmlComponentsList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(lookupHtmlComponentsDtoList, (long) lookupHtmlComponentsDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        List<LookupHtmlComponents> lookupHtmlComponentsList = htmlComponentsService.listAll();
        Page<LookupHtmlComponents> htmlComponentsPage = pageUtils.convertListToPage(lookupHtmlComponentsList, page, size);
        List<LookupHtmlComponentsDto> lookupHtmlComponentsDtoList = htmlComponentsMapper.toDtoList(htmlComponentsPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(lookupHtmlComponentsDtoList, htmlComponentsPage.getTotalElements()));
    }

    public ResponseEntity create(LookupHtmlComponentsDto htmlComponentsDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                htmlComponentsMapper.toDto(htmlComponentsService.createEntity(htmlComponentsMapper.toEntity(htmlComponentsDto)))));
    }

    public ResponseEntity update(LookupHtmlComponentsDto htmlComponentsDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                htmlComponentsMapper.toDto(htmlComponentsService.updateEntity(htmlComponentsMapper.toEntity(htmlComponentsDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(htmlComponentsMapper.toDto(htmlComponentsService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        htmlComponentsService.deleteEntity(htmlComponentsService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
