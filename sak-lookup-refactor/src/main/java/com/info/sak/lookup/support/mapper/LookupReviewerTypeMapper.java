package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.LookupReviewerType;
import com.info.sak.lookup.support.dto.LookupReviewerTypeDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface LookupReviewerTypeMapper extends BaseMapper<Integer, LookupReviewerType, LookupReviewerTypeDto> {
}
