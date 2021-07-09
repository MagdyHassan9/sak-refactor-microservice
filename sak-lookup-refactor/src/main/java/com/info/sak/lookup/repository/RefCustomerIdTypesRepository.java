package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefCustomerIdTypes;
import com.info.sak.lookup.repository.base.BaseRepository;
@Repository

public interface RefCustomerIdTypesRepository  extends BaseRepository<Integer,RefCustomerIdTypes>{
	@Query(value = "select REF_CUSTOMER_ID_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
