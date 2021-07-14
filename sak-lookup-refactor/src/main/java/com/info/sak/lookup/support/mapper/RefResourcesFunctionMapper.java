package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.info.sak.lookup.entity.RefResourcesFunction;
import com.info.sak.lookup.support.dto.RefResourcesFunctionDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {RefFunctionMapper.class})
public interface RefResourcesFunctionMapper extends BaseMapper<Integer, RefResourcesFunction, RefResourcesFunctionDto> {

    @Override
    @Mappings({
            @Mapping(target = "function", ignore = true)
    })
    RefResourcesFunctionDto toDto(RefResourcesFunction entity);
}
