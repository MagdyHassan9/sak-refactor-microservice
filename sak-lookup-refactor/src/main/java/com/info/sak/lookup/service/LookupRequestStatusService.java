package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.LookupRequestStatus;
import com.info.sak.lookup.repository.LookupRequestStatusRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LookupRequestStatusService extends BaseService<LookupRequestStatus, Integer> {

    private LookupRequestStatusRepository requestStatusRepository;

    @Override
    public LookupRequestStatusRepository getBaseRepository() {
        return requestStatusRepository;
    }

    @Override
    public LookupRequestStatus createEntity(LookupRequestStatus e) {
        e.setId(requestStatusRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public LookupRequestStatus findById(Integer entityId) {
        Optional<LookupRequestStatus> requestStatusOptional = requestStatusRepository.findById(entityId);
        return requestStatusOptional.isPresent() ? requestStatusOptional.get() : null;
    }
}
