package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefFunction;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefFunctionRepository extends BaseRepository<Integer, RefFunction> {
//public interface RefFunctionRepository extends JpaRepository<RefFunction, Long> {

    @Query(value = "select REF_FUNCTION_SEQ.nextval from dual", nativeQuery = true)
    Integer getCurrentSeqValue();

}
