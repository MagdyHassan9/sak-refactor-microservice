package com.info.sak.lookup.service;


import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefTransactionCategory;
import com.info.sak.lookup.repository.RefTransactionCategoryRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefTransactionCategoryService extends BaseService<RefTransactionCategory, Integer> {
    private RefTransactionCategoryRepository refTransactionCategoryRepository;
    @Override
    public BaseRepository<Integer, RefTransactionCategory> getBaseRepository() {
        return refTransactionCategoryRepository;
    }

    @Override
    public RefTransactionCategory createEntity(RefTransactionCategory e) {
        e.setId(refTransactionCategoryRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }
    public Boolean deleteEntity(Integer refFunctionId) {
        return super.deleteEntity(findById(refFunctionId));
    }
}
