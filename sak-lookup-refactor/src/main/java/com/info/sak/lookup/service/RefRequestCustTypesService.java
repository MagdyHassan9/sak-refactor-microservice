package com.info.sak.lookup.service;


import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefRequestCustTypes;
import com.info.sak.lookup.repository.RefRequestCustTypesRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefRequestCustTypesService extends BaseService<RefRequestCustTypes, Integer> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2256622219595764358L;
	private RefRequestCustTypesRepository refRequestCustTypesRepository;


    @Override
    public BaseRepository<Integer, RefRequestCustTypes> getBaseRepository() {
        return refRequestCustTypesRepository;
    }

    @Override
    public RefRequestCustTypes createEntity(RefRequestCustTypes e) {
        e.setId(refRequestCustTypesRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }
    public Boolean deleteEntity(Integer refRequestId) {
        return super.deleteEntity(findById(refRequestId));
    }
}

