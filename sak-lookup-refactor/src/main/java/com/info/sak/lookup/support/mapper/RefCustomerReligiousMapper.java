package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefCustomerReligious;
import com.info.sak.lookup.support.dto.RefCustomerReligiousDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefCustomerReligiousMapper extends BaseMapper<Integer, RefCustomerReligious, RefCustomerReligiousDto>{
	RefCustomerReligiousDto toDto(RefCustomerReligious entity);
}
