package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefPaymentFees;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefPaymentFeesRepository extends BaseRepository<Integer, RefPaymentFees> {

    @Query(value = "select REF_PAYMENT_FEES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
