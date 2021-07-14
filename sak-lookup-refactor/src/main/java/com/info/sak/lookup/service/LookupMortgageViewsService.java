package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.LookupMortgageViews;
import com.info.sak.lookup.repository.LookupMortgageViewsRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LookupMortgageViewsService extends BaseService<LookupMortgageViews, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5711569704740545882L;
	private LookupMortgageViewsRepository mortgageViewsRepository;

    @Override
    public LookupMortgageViewsRepository getBaseRepository() {
        return mortgageViewsRepository;
    }

    @Override
    public LookupMortgageViews createEntity(LookupMortgageViews e) {
        e.setId(mortgageViewsRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public LookupMortgageViews findById(Integer entityId) {
        Optional<LookupMortgageViews> mortgageViewsOptional = mortgageViewsRepository.findById(entityId);
        return mortgageViewsOptional.isPresent() ? mortgageViewsOptional.get() : null;
    }
}
