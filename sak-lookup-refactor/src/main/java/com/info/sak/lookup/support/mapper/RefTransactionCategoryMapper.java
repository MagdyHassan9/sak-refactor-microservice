package com.info.sak.lookup.support.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.info.sak.lookup.entity.RefTransactionCategory;
import com.info.sak.lookup.support.dto.RefTransactionCategoryDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {RefTransactionTypesMapper.class})

public interface RefTransactionCategoryMapper extends BaseMapper<Integer, RefTransactionCategory, RefTransactionCategoryDto>{


        @Override
        @Mappings({
                @Mapping(target = "refTransactionCategory", ignore = true)
        })
        RefTransactionCategoryDto toDto(RefTransactionCategory entity);
}
