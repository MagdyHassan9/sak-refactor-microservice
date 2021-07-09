package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefCustomerTypes;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefCustomerTypesRepository extends BaseRepository<Integer,RefCustomerTypes>{
	@Query(value = "select REF_CUSTOMER_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}

