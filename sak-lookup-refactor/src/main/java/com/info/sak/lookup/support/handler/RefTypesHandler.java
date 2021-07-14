package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefTypes;
import com.info.sak.lookup.service.RefTypesService;
import com.info.sak.lookup.support.dto.RefTypesDto;
import com.info.sak.lookup.support.mapper.RefTypesMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefTypesHandler {

    private RefTypesService typesService;
    private RefTypesMapper typesMapper;
    private PageUtils<RefTypes> pageUtils;


    public ResponseEntity list() {
        List<RefTypesDto> refTypesDtoList = typesMapper.toDtoList(typesService.listAll());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(refTypesDtoList, (long) refTypesDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        Page<RefTypes> typesPage = pageUtils.convertListToPage(typesService.listAll(), page, size);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(typesMapper.toDtoList(typesPage.getContent()), typesPage.getTotalElements()));
    }

    public ResponseEntity create(RefTypesDto typesDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                typesMapper.toDto(typesService.createEntity(typesMapper.toEntity(typesDto)))));
    }

    public ResponseEntity update(RefTypesDto typesDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                typesMapper.toDto(typesService.updateEntity(typesMapper.toEntity(typesDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(typesMapper.toDto(typesService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        typesService.deleteEntity(typesService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
