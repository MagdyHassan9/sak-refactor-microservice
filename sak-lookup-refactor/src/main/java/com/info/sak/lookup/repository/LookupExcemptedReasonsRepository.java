package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.LookupExcemptedReasons;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface LookupExcemptedReasonsRepository extends BaseRepository<Integer, LookupExcemptedReasons> {

    @Query(value = "select LKUP_EXCEMPTED_REASONS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
