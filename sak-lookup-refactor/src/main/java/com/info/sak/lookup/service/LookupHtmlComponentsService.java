package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.LookupHtmlComponents;
import com.info.sak.lookup.repository.LookupHtmlComponentsRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LookupHtmlComponentsService extends BaseService<LookupHtmlComponents, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8708252860111232515L;
	private LookupHtmlComponentsRepository htmlComponentsRepository;

    @Override
    public LookupHtmlComponentsRepository getBaseRepository() {
        return htmlComponentsRepository;
    }

    @Override
    public LookupHtmlComponents createEntity(LookupHtmlComponents e) {
        e.setId(htmlComponentsRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public LookupHtmlComponents findById(Integer entityId) {
        Optional<LookupHtmlComponents> htmlComponentsOptional = htmlComponentsRepository.findById(entityId);
        return htmlComponentsOptional.isPresent() ? htmlComponentsOptional.get() : null;
    }
}
