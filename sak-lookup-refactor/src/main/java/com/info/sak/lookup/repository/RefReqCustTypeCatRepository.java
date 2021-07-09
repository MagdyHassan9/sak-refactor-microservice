package com.info.sak.lookup.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefReqCustTypeCat;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefReqCustTypeCatRepository  extends BaseRepository<Integer, RefReqCustTypeCat> {
    @Query(value = "select REF_REQ_CUST_TYPE_CAT_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
