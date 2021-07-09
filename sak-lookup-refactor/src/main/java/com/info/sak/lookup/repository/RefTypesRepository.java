package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefTypes;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefTypesRepository extends BaseRepository<Integer, RefTypes> {

    @Query(value = "select REF_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}