package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefRequestSource;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefRequestSourceRepository extends BaseRepository<Integer, RefRequestSource> {

    @Query(value = "select REF_REQUEST_SOURCE_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();


}
