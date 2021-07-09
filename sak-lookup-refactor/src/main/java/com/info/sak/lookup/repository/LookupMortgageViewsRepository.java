package com.info.sak.lookup.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.LookupMortgageViews;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface LookupMortgageViewsRepository extends BaseRepository<Integer, LookupMortgageViews> {


    @Query(value = "select LKUP_MORTGAGE_VIEWS_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();

}
