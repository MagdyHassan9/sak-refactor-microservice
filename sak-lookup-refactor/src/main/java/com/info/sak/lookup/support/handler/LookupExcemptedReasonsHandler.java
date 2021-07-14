package com.info.sak.lookup.support.handler;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.LookupExcemptedReasons;
import com.info.sak.lookup.service.LookupExcemptedReasonsService;
import com.info.sak.lookup.support.dto.LookupExcemptedReasonsDto;
import com.info.sak.lookup.support.mapper.LookupExcemptedReasonsMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class LookupExcemptedReasonsHandler {
    private LookupExcemptedReasonsService excemptedReasonsService;
    private LookupExcemptedReasonsMapper excemptedReasonsMapper;
    private PageUtils<LookupExcemptedReasons> pageUtils;


    public ResponseEntity list() {
        List<LookupExcemptedReasons> excemptedReasonsList = excemptedReasonsService.listAll();
        List<LookupExcemptedReasonsDto> excemptedReasonsDtoList = excemptedReasonsMapper.toDtoList(excemptedReasonsList);
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(excemptedReasonsDtoList, (long) excemptedReasonsDtoList.size()));
    }

    public ResponseEntity list(int page, int size) {
        List<LookupExcemptedReasons> excemptedReasonsList = excemptedReasonsService.listAll();
        Page<LookupExcemptedReasons> excemptedReasonsPage = pageUtils.convertListToPage(excemptedReasonsList, page, size);
        List<LookupExcemptedReasonsDto> excemptedReasonsDtoList = excemptedReasonsMapper.toDtoList(excemptedReasonsPage.getContent());
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(excemptedReasonsDtoList, excemptedReasonsPage.getTotalElements()));
    }

    public ResponseEntity create(LookupExcemptedReasonsDto excemptedReasonsDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                excemptedReasonsMapper.toDto(excemptedReasonsService.createEntity(excemptedReasonsMapper.toEntity(excemptedReasonsDto)))));
    }

    public ResponseEntity update(LookupExcemptedReasonsDto excemptedReasonsDto) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(
                excemptedReasonsMapper.toDto(excemptedReasonsService.updateEntity(excemptedReasonsMapper.toEntity(excemptedReasonsDto)))));
    }

    public ResponseEntity findById(Integer entityId) {
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(excemptedReasonsMapper.toDto(excemptedReasonsService.findById(entityId))));
    }

    public ResponseEntity delete(Integer entityId) {
        excemptedReasonsService.deleteEntity(excemptedReasonsService.findById(entityId));
        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
    }
}
