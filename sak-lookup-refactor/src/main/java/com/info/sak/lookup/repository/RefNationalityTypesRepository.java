package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefNationalityTypes;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefNationalityTypesRepository extends BaseRepository<Integer, RefNationalityTypes> {
    @Query(value = "select REF_NATIONALITY_TYPES_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}