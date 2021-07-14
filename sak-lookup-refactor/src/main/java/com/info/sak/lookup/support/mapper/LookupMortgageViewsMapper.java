package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.LookupMortgageViews;
import com.info.sak.lookup.support.dto.LookupMortgageViewsDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface LookupMortgageViewsMapper extends BaseMapper<Integer, LookupMortgageViews, LookupMortgageViewsDto> {
}
