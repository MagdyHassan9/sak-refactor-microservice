package com.info.sak.lookup.support.mapper;


import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefCustomerIdTypes;
import com.info.sak.lookup.support.dto.RefCustomerIdTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefCustomerIdTypesMapper extends BaseMapper<Integer, RefCustomerIdTypes, RefCustomerIdTypesDto>{
	RefCustomerIdTypesDto toDto(RefCustomerIdTypes entity);
}
