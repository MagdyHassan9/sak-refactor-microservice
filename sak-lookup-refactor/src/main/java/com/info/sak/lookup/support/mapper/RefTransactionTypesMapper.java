package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.info.sak.lookup.entity.RefTransactionTypes;
import com.info.sak.lookup.support.dto.RefTransactionTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = { RefTransactionCategoryMapper.class})
public interface RefTransactionTypesMapper  extends BaseMapper<Integer, RefTransactionTypes, RefTransactionTypesDto> {
    @Override
    @Mappings({
            @Mapping(target = "transactionCategory", ignore = true),
            @Mapping(target = "issueTypeCategory", ignore = true)
    })


    RefTransactionTypesDto toDto(RefTransactionTypes entity);

}