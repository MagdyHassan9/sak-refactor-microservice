package com.info.sak.lookup.repository;

import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.FdSignatories;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface FdSignatoriesRepository extends BaseRepository<Integer, FdSignatories> {

}
