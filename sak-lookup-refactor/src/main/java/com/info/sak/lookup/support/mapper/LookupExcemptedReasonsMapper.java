package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.LookupExcemptedReasons;
import com.info.sak.lookup.support.dto.LookupExcemptedReasonsDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;


@Mapper(componentModel = "spring")
public interface LookupExcemptedReasonsMapper extends BaseMapper<Integer, LookupExcemptedReasons, LookupExcemptedReasonsDto> {
}
