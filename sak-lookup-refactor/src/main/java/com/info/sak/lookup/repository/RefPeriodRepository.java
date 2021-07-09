package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefPeriod;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefPeriodRepository extends BaseRepository<Integer, RefPeriod> {


    @Query(value = "select REF_PERIOD_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
