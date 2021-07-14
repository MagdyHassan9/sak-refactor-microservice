package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefRequestSource;
import com.info.sak.lookup.support.dto.RefRequestSourceDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefRequestSourceMapper extends BaseMapper<Integer, RefRequestSource, RefRequestSourceDto> {
}
