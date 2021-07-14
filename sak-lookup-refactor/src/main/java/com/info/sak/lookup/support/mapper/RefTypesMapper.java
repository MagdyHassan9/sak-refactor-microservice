package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefTypes;
import com.info.sak.lookup.support.dto.RefTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper; 

@Mapper(componentModel = "spring")
public interface RefTypesMapper extends BaseMapper<Integer, RefTypes, RefTypesDto> {

}