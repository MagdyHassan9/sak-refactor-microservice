package com.info.sak.lookup.repository.base;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.info.sak.lookup.entity.base.DomainEntity;

public interface BaseRepository<id extends Serializable, entity extends DomainEntity  > extends JpaRepository<entity, id> {
}
