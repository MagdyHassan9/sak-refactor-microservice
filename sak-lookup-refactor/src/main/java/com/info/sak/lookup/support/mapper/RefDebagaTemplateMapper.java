package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.info.sak.lookup.entity.RefDebagaTemplate;
import com.info.sak.lookup.support.dto.RefDebagaTemplateDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;


@Mapper(componentModel = "spring",uses = {LookupHtmlComponentsMapper.class})
public interface RefDebagaTemplateMapper  extends BaseMapper<Integer, RefDebagaTemplate, RefDebagaTemplateDto>{

	@Override
	@Mappings({
			//	@Mapping(target = "lookupHtmlComponents", ignore = true),
//	     @Mapping(target = "parentDebagaTemplate.childDebagaTemplates", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.parentDebagaTemplate", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.code", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.description", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.sortOrder", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.text", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.lookupHtmlComponents", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.classType", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.columnType", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.maxVal", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.minVal", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.required", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.expiredMonths", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.cost", ignore = true),
//			@Mapping(target = "parentDebagaTemplate.statics", ignore = true),
			@Mapping(target = "parentDebagaTemplate", ignore = true)

	})
	RefDebagaTemplateDto toDto(RefDebagaTemplate entity);
}