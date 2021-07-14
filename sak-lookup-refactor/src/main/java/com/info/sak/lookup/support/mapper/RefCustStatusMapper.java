package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefCustStatus;
import com.info.sak.lookup.support.dto.RefCustStatusDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefCustStatusMapper extends BaseMapper<Integer, RefCustStatus, RefCustStatusDto>{
	RefCustStatusDto toDto(RefCustStatus entity);
}