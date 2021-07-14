package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefTypes;
import com.info.sak.lookup.repository.RefTypesRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.Data;

@Service
@Data
public class RefTypesService extends BaseService<RefTypes, Integer> {

    private RefTypesRepository typesRepository;

    @Override
    public RefTypesRepository getBaseRepository() {
        return typesRepository;
    }

    @Override
    public RefTypes createEntity(RefTypes e) {
        e.setId(typesRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public RefTypes findById(Integer entityId) {
        Optional<RefTypes> typesOptional = typesRepository.findById(entityId);
        return typesOptional.isPresent() ? typesOptional.get() : null;
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }

}
