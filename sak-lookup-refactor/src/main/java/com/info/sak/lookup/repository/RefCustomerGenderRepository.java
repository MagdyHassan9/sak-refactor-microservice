package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefCustomerGender;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefCustomerGenderRepository  extends BaseRepository<Integer, RefCustomerGender> {
	@Query(value = "select REF_CUSTOMER_GENDER_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
