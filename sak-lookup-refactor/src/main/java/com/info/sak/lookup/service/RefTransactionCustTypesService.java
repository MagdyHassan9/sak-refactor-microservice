package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefTransactionCustTypes;
import com.info.sak.lookup.repository.RefTransactionCustTypesRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.Data;

@Service
@Data
public class RefTransactionCustTypesService extends BaseService<RefTransactionCustTypes, Integer> {


    private RefTransactionCustTypesRepository transactionCustTypesRepository;

    @Override
    public RefTransactionCustTypesRepository getBaseRepository() {
        return transactionCustTypesRepository;
    }

    @Override
    public RefTransactionCustTypes createEntity(RefTransactionCustTypes e) {
        e.setId(transactionCustTypesRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public RefTransactionCustTypes findById(Integer entityId) {
        Optional<RefTransactionCustTypes> transactionCustTypesOptional = transactionCustTypesRepository.findById(entityId);
        return transactionCustTypesOptional.isPresent() ? transactionCustTypesOptional.get() : null;
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }

}
