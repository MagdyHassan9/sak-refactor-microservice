package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.LookupReviewerType;
import com.info.sak.lookup.repository.LookupReviewerTypeRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LookupReviewerTypeService extends BaseService<LookupReviewerType, Integer> {

    private LookupReviewerTypeRepository reviewerTypeRepository;

    @Override
    public LookupReviewerTypeRepository getBaseRepository() {
        return reviewerTypeRepository;
    }

    @Override
    public LookupReviewerType createEntity(LookupReviewerType e) {
        e.setId(reviewerTypeRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public LookupReviewerType findById(Integer entityId) {
        Optional<LookupReviewerType> reviewerTypeOptional = reviewerTypeRepository.findById(entityId);
        return reviewerTypeOptional.isPresent() ? reviewerTypeOptional.get() : null;
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }
}
