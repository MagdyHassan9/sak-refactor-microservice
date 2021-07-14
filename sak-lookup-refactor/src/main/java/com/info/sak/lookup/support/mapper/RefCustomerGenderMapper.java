package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefCustomerGender;
import com.info.sak.lookup.support.dto.RefCustomerGenderDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefCustomerGenderMapper extends BaseMapper<Integer, RefCustomerGender, RefCustomerGenderDto>{
	RefCustomerGenderDto toDto(RefCustomerGender entity);
}
