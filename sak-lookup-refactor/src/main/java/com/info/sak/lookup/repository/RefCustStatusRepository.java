package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefCustStatus;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefCustStatusRepository extends BaseRepository<Integer, RefCustStatus> {
	@Query(value = "select REF_CUST_STATUS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
