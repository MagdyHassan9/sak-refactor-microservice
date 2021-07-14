package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefProcStatus;
import com.info.sak.lookup.support.dto.RefProcStatusDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefProcStatusMapper extends BaseMapper<Integer, RefProcStatus, RefProcStatusDto> {

}
