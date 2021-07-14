package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefFunction;
import com.info.sak.lookup.support.dto.RefFunctionDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {RefFunctionCategoryMapper.class, RefResourcesFunctionMapper.class})
public interface RefFunctionMapper extends BaseMapper<Integer, RefFunction, RefFunctionDto> {

}