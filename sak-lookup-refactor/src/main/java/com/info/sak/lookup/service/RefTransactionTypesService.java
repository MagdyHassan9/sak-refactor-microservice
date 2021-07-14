package com.info.sak.lookup.service;


import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefTransactionTypes;
import com.info.sak.lookup.repository.RefTransactionTypesRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefTransactionTypesService extends BaseService<RefTransactionTypes, Integer> {
    private RefTransactionTypesRepository refTransactionTypesRepository;
    @Override
    public BaseRepository<Integer, RefTransactionTypes> getBaseRepository() {
        return refTransactionTypesRepository;
    }

    @Override
    public RefTransactionTypes createEntity(RefTransactionTypes e) {
        e.setId(refTransactionTypesRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }
    public Boolean deleteEntity(Integer refFunctionId) {
        return super.deleteEntity(findById(refFunctionId));
    }
}
