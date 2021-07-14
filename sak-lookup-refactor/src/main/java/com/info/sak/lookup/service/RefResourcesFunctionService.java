package com.info.sak.lookup.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefResourcesFunction;
import com.info.sak.lookup.repository.RefResourcesFunctionRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefResourcesFunctionService extends BaseService<RefResourcesFunction, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7566485022113283329L;
	private RefResourcesFunctionRepository resourcesFunctionRepository;

    @Override
    public RefResourcesFunctionRepository getBaseRepository() {
        return resourcesFunctionRepository;
    }

    @Override
    public List<RefResourcesFunction> listAll() {
        return super.listAll();
    }

    @Override
    public RefResourcesFunction updateEntity(RefResourcesFunction e) {
        return super.updateEntity(e);
    }

    @Override
    public RefResourcesFunction createEntity(RefResourcesFunction e) {
        e.setId(resourcesFunctionRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }
}
