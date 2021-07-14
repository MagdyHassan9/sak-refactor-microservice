package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefPayTypes;
import com.info.sak.lookup.repository.RefPayTypesRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.Data;

@Service
@Data
public class RefPayTypesService extends BaseService<RefPayTypes, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6146620661835745047L;
	private RefPayTypesRepository payTypesRepository;

    @Override
    public RefPayTypesRepository getBaseRepository() {
        return payTypesRepository;
    }


    @Override
    public RefPayTypes createEntity(RefPayTypes e) {
        e.setId(payTypesRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public RefPayTypes findById(Integer entityId) {
        Optional<RefPayTypes> payTypesOptional = payTypesRepository.findById(entityId);
        return payTypesOptional.isPresent() ? payTypesOptional.get() : null;
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }

}
