package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefFunctionCategory;
import com.info.sak.lookup.repository.base.BaseRepository;
@Repository
public interface RefFunctionCategoryRepository extends BaseRepository<Integer, RefFunctionCategory> {
//public interface RefFunctionCategoryRepository extends JpaRepository<RefFunctionCategory, Integer> {

    @Query(value = "select REF_FUNCTION_CATEGORY_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
