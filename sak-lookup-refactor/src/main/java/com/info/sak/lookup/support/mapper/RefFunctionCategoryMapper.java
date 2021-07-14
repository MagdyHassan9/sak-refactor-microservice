package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.info.sak.lookup.entity.RefFunctionCategory;
import com.info.sak.lookup.support.dto.RefFunctionCategoryDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefFunctionCategoryMapper extends BaseMapper<Integer, RefFunctionCategory, RefFunctionCategoryDto> {

    @Override
    @Mappings({
            @Mapping(target = "children", ignore = true),
            @Mapping(target = "parentFunctionCategory", ignore = true),
            @Mapping(target = "functionList", ignore = true)
    })
    RefFunctionCategoryDto toDto(RefFunctionCategory entity);
}
