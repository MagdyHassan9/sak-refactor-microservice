package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.LookupExcemptedReasons;
import com.info.sak.lookup.repository.LookupExcemptedReasonsRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LookupExcemptedReasonsService extends BaseService<LookupExcemptedReasons, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 2998066573029584377L;
	private LookupExcemptedReasonsRepository lookupExcemptedReasonsRepository;

    @Override
    public LookupExcemptedReasonsRepository getBaseRepository() {
        return lookupExcemptedReasonsRepository;
    }

    @Override
    public LookupExcemptedReasons updateEntity(LookupExcemptedReasons e) {
        return super.updateEntity(e);
    }

    @Override
    public LookupExcemptedReasons createEntity(LookupExcemptedReasons e) {
        e.setId(lookupExcemptedReasonsRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public LookupExcemptedReasons findById(Integer entityId) {
        Optional<LookupExcemptedReasons> excemptedReasonsOptional = lookupExcemptedReasonsRepository.findById(entityId);
        return excemptedReasonsOptional.isPresent() ? excemptedReasonsOptional.get() : null;
    }
}
