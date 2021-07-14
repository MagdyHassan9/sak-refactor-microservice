package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.LookupHtmlComponents;
import com.info.sak.lookup.support.dto.LookupHtmlComponentsDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface LookupHtmlComponentsMapper extends BaseMapper<Integer, LookupHtmlComponents, LookupHtmlComponentsDto> {




}
