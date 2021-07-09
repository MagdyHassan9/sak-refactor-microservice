package com.info.sak.lookup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.LookupRequestStatus;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface LookupRequestStatusRepository extends BaseRepository<Integer, LookupRequestStatus> {


    @Query(value = "select LKUP_REQUEST_STATUS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

    List<LookupRequestStatus> getAllByCode(String requestStatusCode);

    List<LookupRequestStatus> getAllByCodeLike(String requestStatusCode);

}
