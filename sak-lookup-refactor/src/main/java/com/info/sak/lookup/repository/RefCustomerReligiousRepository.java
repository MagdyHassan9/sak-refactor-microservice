package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefCustomerReligious;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefCustomerReligiousRepository extends BaseRepository<Integer, RefCustomerReligious> {

	@Query(value = "select REF_CUSTOMER_RELIGIOUS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
