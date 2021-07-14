package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefProcStatus;
import com.info.sak.lookup.repository.RefProcStatusRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.Data;


@Service
@Data
public class RefProcStatusService extends BaseService<RefProcStatus, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3950029648266789829L;
	private RefProcStatusRepository procStatusRepository;

    @Override
    public RefProcStatusRepository getBaseRepository() {
        return procStatusRepository;
    }


    @Override
    public RefProcStatus createEntity(RefProcStatus e) {
        e.setId(procStatusRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public RefProcStatus findById(Integer entityId) {
        Optional<RefProcStatus> refProcStatusOptional = procStatusRepository.findById(entityId);
        return refProcStatusOptional.isPresent() ? refProcStatusOptional.get() : null;
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }

}
