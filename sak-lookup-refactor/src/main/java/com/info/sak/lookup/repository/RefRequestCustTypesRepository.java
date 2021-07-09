package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefRequestCustTypes;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefRequestCustTypesRepository extends BaseRepository<Integer, RefRequestCustTypes> {
    @Query(value = "select REF_REQUEST_CUST_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
