package com.info.sak.lookup.support.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.info.sak.lookup.entity.RefReqCustTypeCat;
import com.info.sak.lookup.support.dto.RefReqCustTypeCatDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {RefRequestCustTypesMapper.class})
public interface RefReqCustTypesCatMapper extends BaseMapper<Integer, RefReqCustTypeCat, RefReqCustTypeCatDto> {
    @Override
    @Mappings({
            @Mapping(target = "refRequestCustTypes", ignore = true)
    })
    RefReqCustTypeCatDto toDto(RefReqCustTypeCat entity);

}
