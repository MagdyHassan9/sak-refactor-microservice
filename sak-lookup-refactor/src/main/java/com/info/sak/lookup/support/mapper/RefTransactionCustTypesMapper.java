package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefTransactionCustTypes;
import com.info.sak.lookup.support.dto.RefTransactionCustTypesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefTransactionCustTypesMapper extends BaseMapper<Integer, RefTransactionCustTypes, RefTransactionCustTypesDto> {


}
