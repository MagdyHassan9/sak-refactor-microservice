package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefNationalityTypesTable;
import com.info.sak.lookup.support.dto.RefNationalityTypesTableDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefNationalityTypesTableMapper extends BaseMapper<Integer, RefNationalityTypesTable, RefNationalityTypesTableDto> {


}
