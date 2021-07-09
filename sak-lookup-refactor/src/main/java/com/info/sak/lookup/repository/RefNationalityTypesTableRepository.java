package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefNationalityTypesTable;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefNationalityTypesTableRepository extends BaseRepository<Integer, RefNationalityTypesTable> {
    @Query(value = "select REF_NATIONALITY_TYPES_TABLE_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();
}