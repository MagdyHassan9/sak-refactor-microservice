package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefPayTypes;
import com.info.sak.lookup.support.dto.RefPayTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefPayTypesMapper extends BaseMapper<Integer, RefPayTypes, RefPayTypesDto> {

}
