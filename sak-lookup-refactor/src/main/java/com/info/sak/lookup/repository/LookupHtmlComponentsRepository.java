package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.LookupHtmlComponents;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface LookupHtmlComponentsRepository extends BaseRepository<Integer, LookupHtmlComponents> {

    @Query(value = "select LKUP_HTML_COMPONENTS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
