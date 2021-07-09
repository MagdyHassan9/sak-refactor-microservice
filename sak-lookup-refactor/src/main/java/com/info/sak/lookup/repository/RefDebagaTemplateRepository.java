package com.info.sak.lookup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.RefDebagaTemplate;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface RefDebagaTemplateRepository extends BaseRepository<Integer, RefDebagaTemplate> {
    @Query(value = "select REF_REF_DEBAGA_TEMPLATE_SEQ.nextval from dual ", nativeQuery = true)
    Integer getCurrentSeqValue();


//	@Query(value = " SELECT * FROM REF_DEBAGA_TEMPLATE WHERE ID IN ( 8811,8809,8810,8812,8813,8814,9100,9101,9102,9103,9104,9105,9106" +
//			",9107,9108,9109,9110,9111,9112,9113,9282,9283,9284,9285,9174" +
//			",9175,9114,9321,9368 ) " , nativeQuery = true)


    @Query(value = " SELECT * FROM REF_DEBAGA_TEMPLATE WHERE ID IN ( ?1 ) ", nativeQuery = true)
    List<RefDebagaTemplate> getAllBYRequestId(List<Integer> isList);
}
