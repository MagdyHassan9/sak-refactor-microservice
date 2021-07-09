package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefCustCats;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefCustCatsRepository extends BaseRepository<Integer, RefCustCats> {
	@Query(value = "select REF_CUST_CATS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}

