package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefRequestSource;
import com.info.sak.lookup.repository.RefRequestSourceRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefRequestSourceService extends BaseService<RefRequestSource, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 171183221512025256L;
	private RefRequestSourceRepository requestSourceRepository;

    @Override
    public RefRequestSourceRepository getBaseRepository() {
        return requestSourceRepository;
    }

    @Override
    public RefRequestSource createEntity(RefRequestSource e) {
        e.setId(requestSourceRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }

    @Override
    public RefRequestSource findById(Integer entityId) {
        Optional<RefRequestSource> requestSourceOptional = requestSourceRepository.findById(entityId);
        return requestSourceOptional.isPresent() ? requestSourceOptional.get() : null;
    }
}
