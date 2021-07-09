package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefResourcesFunction;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefResourcesFunctionRepository extends BaseRepository<Integer, RefResourcesFunction> {

    @Query(value = "select REF_RESOURCES_FUNCTION_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
