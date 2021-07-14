package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefPeriod;
import com.info.sak.lookup.repository.RefPeriodRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.Data;


@Service
@Data
public class RefPeriodService extends BaseService<RefPeriod, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8852532813660080431L;
	private RefPeriodRepository periodRepository;

    @Override
    public RefPeriodRepository getBaseRepository() {
        return periodRepository;
    }

    @Override
    public RefPeriod createEntity(RefPeriod e) {
        e.setId(periodRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public RefPeriod findById(Integer entityId) {
        Optional<RefPeriod> refPeriodOptional = periodRepository.findById(entityId);
        return refPeriodOptional.isPresent() ? refPeriodOptional.get() : null;
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }

}
