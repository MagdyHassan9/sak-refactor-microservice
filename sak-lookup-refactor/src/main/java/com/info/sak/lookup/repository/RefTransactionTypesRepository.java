package com.info.sak.lookup.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefTransactionTypes;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefTransactionTypesRepository extends BaseRepository<Integer, RefTransactionTypes> {
    @Query(value = "select REF_TRANSACTION_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
