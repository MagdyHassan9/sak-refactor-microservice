package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.info.sak.lookup.entity.RefRequestCustTypes;
import com.info.sak.lookup.support.dto.RefRequestCustTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {RefReqCustTypesCatMapper.class})

public interface RefRequestCustTypesMapper extends BaseMapper<Integer, RefRequestCustTypes, RefRequestCustTypesDto> {
    @Override
    @Mappings({
            @Mapping(target = "refReqCustTypeCatList", ignore = true)
    })
    RefRequestCustTypesDto toDto(RefRequestCustTypes entity);
}
