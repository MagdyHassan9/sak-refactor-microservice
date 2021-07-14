package com.info.sak.lookup.support.handler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefDebagaTemplate;
import com.info.sak.lookup.service.RefDebagaTemplateService;
import com.info.sak.lookup.support.dto.RefDebagaTemplateDto;
import com.info.sak.lookup.support.mapper.RefDebagaTemplateMapper;
import com.info.sak.lookup.support.response.base.SuccessPageResponse;
import com.info.sak.lookup.support.response.base.SuccessResponse;
import com.info.sak.lookup.utils.PageUtils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefDebagaTemplateHandler {
	private RefDebagaTemplateMapper refDebagaTemplateMapper;
	private RefDebagaTemplateService refDebagaTemplateService;
	private PageUtils<RefDebagaTemplate> pageUtils;

	public ResponseEntity listRefDebagaTemplateHandler() {
		Map<Integer, RefDebagaTemplate> hm = new HashMap<Integer, RefDebagaTemplate>();
//		List<RefDebagaTemplate> debagaTemplateList = refDebagaTemplateService.getHierarchicalDebagaTemplates(hm);
//		List<RefDebagaTemplateDto> refDebagaTemplateDtoList = refDebagaTemplateMapper.toDtoList(debagaTemplateList);
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(null, (long) 0));
	}

	public ResponseEntity listRefDebagaTemplateHandler(Integer requestTypeId) {
		Map<Integer, RefDebagaTemplate> hm = new HashMap<Integer, RefDebagaTemplate>();
//		List<RefDebagaTemplate> debagaTemplateList = refDebagaTemplateService.getRefDebagaTemplatesBYRequestId(requestTypeId);
//	    Page<RefDebagaTemplate> refDebagaTemplatePage = pageUtils.convertListToPage(debagaTemplateList, page, size);
//		List<RefDebagaTemplateDto> refDebagaTemplateDtoList = refDebagaTemplateMapper.toDtoList(debagaTemplateList);
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(null, (long) 0));
	}

	public ResponseEntity listRefDebagaTemplateHandler(int page, int size) {
		Map<Integer, RefDebagaTemplate> hm = new HashMap<Integer, RefDebagaTemplate>();
//		List<RefDebagaTemplate> debagaTemplateList = refDebagaTemplateService.getHierarchicalDebagaTemplates(hm);
//		Page<RefDebagaTemplate> refDebagaTemplatePage = pageUtils.convertListToPage(debagaTemplateList, page, size);
//		List<RefDebagaTemplateDto> refDebagaTemplateDtoList = refDebagaTemplateMapper.toDtoList(refDebagaTemplatePage.getContent());
		return ResponseEntity.status(HttpStatus.OK).body(new SuccessPageResponse(null,(long) 0));
	}

	public ResponseEntity createRefDebagaTemplateHandler(RefDebagaTemplateDto refDebagaTemplateDto) {
		RefDebagaTemplate refDebagaTemplateCreated = refDebagaTemplateService.createEntity(refDebagaTemplateMapper.toEntity(refDebagaTemplateDto));
	    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refDebagaTemplateMapper.toDto(refDebagaTemplateCreated)));
	}

	public ResponseEntity updateRefDebagaTemplateHandler(RefDebagaTemplateDto refDebagaTemplateDto) {
		RefDebagaTemplate refDebagaTemplateCreated = refDebagaTemplateService.updateEntity(refDebagaTemplateMapper.toEntity(refDebagaTemplateDto));
	    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refDebagaTemplateMapper.toDto(refDebagaTemplateCreated)));
	}

	public ResponseEntity handleRefDebagaTemplateFindById(Integer refDebagaTemplateId) {
		RefDebagaTemplate refDebagaTemplate= refDebagaTemplateService.findById(refDebagaTemplateId);
	    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse(refDebagaTemplateMapper.toDto(refDebagaTemplate)));
	}

	public ResponseEntity handleRefDebagaTemplateDeleteById(Integer refDebagaTemplateId) {
	    refDebagaTemplateService.deleteEntity(refDebagaTemplateId);
	    return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse());
	}



	}