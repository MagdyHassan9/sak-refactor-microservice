package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefGovernments;
import com.info.sak.lookup.support.dto.RefGovernmentsDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;


@Mapper(componentModel = "spring")
public interface RefGovernmentsMapper extends BaseMapper<Integer, RefGovernments, RefGovernmentsDto> {
    @Override
    RefGovernmentsDto toDto(RefGovernments entity);

}