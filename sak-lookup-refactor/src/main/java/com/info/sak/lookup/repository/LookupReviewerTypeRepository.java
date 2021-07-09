package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.LookupReviewerType;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface LookupReviewerTypeRepository extends BaseRepository<Integer, LookupReviewerType> {

    @Query(value = "select LKUP_REVIEWER_TYPE_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
