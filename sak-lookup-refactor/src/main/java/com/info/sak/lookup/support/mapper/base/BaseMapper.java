package com.info.sak.lookup.support.mapper.base;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.entity.base.DomainEntity;
import com.info.sak.lookup.support.dto.base.BaseDto;


public interface BaseMapper<id extends Serializable, Entity extends DomainEntity<id>, Dto extends BaseDto<id>> {

    Entity toEntity(Dto dto);

    Dto toDto(Entity entity);

    List<Entity> toEntityList(List<Dto> dtoList);

    List<Dto> toDtoList(List<Entity> entityList);
}
