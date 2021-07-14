package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.FdSignatories;
import com.info.sak.lookup.support.dto.FdSignatoriesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {FacilityDataMapper.class})
public interface FdSignatoriesMapper extends BaseMapper<Integer, FdSignatories, FdSignatoriesDto> {
}
