package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefNationalityTypes;
import com.info.sak.lookup.support.dto.RefNationalityTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;


@Mapper(componentModel = "spring")
public interface RefNationalityTypesMapper extends BaseMapper<Integer, RefNationalityTypes,RefNationalityTypesDto> {
    @Override
 
    RefNationalityTypesDto toDto(RefNationalityTypes entity);

}
