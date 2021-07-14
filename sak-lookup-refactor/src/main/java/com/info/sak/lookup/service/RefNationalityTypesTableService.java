package com.info.sak.lookup.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefNationalityTypesTable;
import com.info.sak.lookup.repository.RefNationalityTypesTableRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefNationalityTypesTableService extends BaseService<RefNationalityTypesTable, Integer> {
    private RefNationalityTypesTableRepository refNationalityTypesTableRepository;

    @Override
    public BaseRepository<Integer, RefNationalityTypesTable> getBaseRepository() {
        return refNationalityTypesTableRepository;
    }

    public List<RefNationalityTypesTable> listAll() {
        return refNationalityTypesTableRepository.findAll();
    }

    public RefNationalityTypesTable createEntity(RefNationalityTypesTable refNationalityTypes) {
        refNationalityTypes.setId(refNationalityTypesTableRepository.getCurrentSeqValue());
        return refNationalityTypesTableRepository.save(refNationalityTypes);
    }

    public RefNationalityTypesTable findById(Integer refNationalityTypesId) {
        Optional<RefNationalityTypesTable> refNationalityTypesOptional = refNationalityTypesTableRepository.findById(refNationalityTypesId);
        if (refNationalityTypesOptional.isPresent()) {
            return refNationalityTypesOptional.get();
        }
        return null;
    }

    @Override
    public RefNationalityTypesTable updateEntity(RefNationalityTypesTable e) {
        return super.updateEntity(e);
    }

    public Boolean deleteEntity(Integer refNationalityTypesId) {
        return super.deleteEntity(findById(refNationalityTypesId));
    }
}