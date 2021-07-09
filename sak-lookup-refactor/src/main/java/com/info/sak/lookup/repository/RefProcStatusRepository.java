package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefProcStatus;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefProcStatusRepository extends BaseRepository<Integer, RefProcStatus> {


    @Query(value = "select REF_PROC_STATUS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
