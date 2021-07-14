package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefCustomerTypes;
import com.info.sak.lookup.support.dto.RefCustomerTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefCustomerTypesMapper extends BaseMapper<Integer, RefCustomerTypes, RefCustomerTypesDto>{
	RefCustomerTypesDto toDto(RefCustomerTypes entity);
}