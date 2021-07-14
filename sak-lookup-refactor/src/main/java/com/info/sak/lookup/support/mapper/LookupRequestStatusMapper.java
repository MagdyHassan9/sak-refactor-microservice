package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.LookupRequestStatus;
import com.info.sak.lookup.support.dto.LookupRequestStatusDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface LookupRequestStatusMapper extends BaseMapper<Integer, LookupRequestStatus, LookupRequestStatusDto> {
}
