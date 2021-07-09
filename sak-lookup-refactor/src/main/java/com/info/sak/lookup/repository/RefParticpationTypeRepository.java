package com.info.sak.lookup.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefParticpationType;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefParticpationTypeRepository extends BaseRepository<Integer, RefParticpationType> {

    @Query(value = "select REF_PARTICPATION_TYPE_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}
