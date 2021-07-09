package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefTransactionCustTypes;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefTransactionCustTypesRepository extends BaseRepository<Integer, RefTransactionCustTypes> {

    @Query(value = "select REF_TRANSACTION_CUST_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
