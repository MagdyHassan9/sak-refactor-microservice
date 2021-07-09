package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefPayTypes;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefPayTypesRepository extends BaseRepository<Integer, RefPayTypes> {


    @Query(value = "select REF_PAY_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
