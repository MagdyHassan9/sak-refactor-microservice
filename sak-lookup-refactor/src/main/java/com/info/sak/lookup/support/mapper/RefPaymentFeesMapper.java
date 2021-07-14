package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefPaymentFees;
import com.info.sak.lookup.support.dto.RefPaymentFeesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefPaymentFeesMapper extends BaseMapper<Integer, RefPaymentFees, RefPaymentFeesDto> {

}
