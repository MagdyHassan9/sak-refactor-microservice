package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefGovernments;
import com.info.sak.lookup.repository.base.BaseRepository;
@Repository
public interface RefGovernmentsRepository extends BaseRepository<Integer, RefGovernments> {
	  @Query(value = "select REF_GOVERNMETS_SEQ.nextval from dual", nativeQuery = true)
	    Integer getCurrentSeqValue();
}
