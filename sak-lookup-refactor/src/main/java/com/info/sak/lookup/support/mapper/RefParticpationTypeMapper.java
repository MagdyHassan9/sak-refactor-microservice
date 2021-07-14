package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefParticpationType;
import com.info.sak.lookup.support.dto.RefParticpationTypeDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefParticpationTypeMapper extends BaseMapper<Integer, RefParticpationType, RefParticpationTypeDto> {
    RefParticpationTypeDto toDto(RefParticpationType entity);
}