package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefPeriod;
import com.info.sak.lookup.support.dto.RefPeriodDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefPeriodMapper extends BaseMapper<Integer, RefPeriod, RefPeriodDto> {

}
