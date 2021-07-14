package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefNationalityTypes;
import com.info.sak.lookup.repository.RefNationalityTypesRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

@Service
public class RefNationalityTypesService extends BaseService<RefNationalityTypes, Integer>{
	private RefNationalityTypesRepository refNationalityTypesRepository;
	@Override
	public BaseRepository<Integer, RefNationalityTypes> getBaseRepository() {
		return refNationalityTypesRepository;
	}
	
	public List<RefNationalityTypes> listAll() {
        return refNationalityTypesRepository.findAll();
    }
	
	public RefNationalityTypes createEntity(RefNationalityTypes refNationalityTypes) {
		refNationalityTypes.setId(refNationalityTypesRepository.getCurrentSeqValue());
        return refNationalityTypesRepository.save(refNationalityTypes);
    }
	
	public RefNationalityTypes findById(Integer refNationalityTypesId) {
        Optional<RefNationalityTypes> refNationalityTypesOptional = refNationalityTypesRepository.findById(refNationalityTypesId);
        if (refNationalityTypesOptional.isPresent()) {
            return refNationalityTypesOptional.get();
        }
        return null;
    }
	@Override
    public RefNationalityTypes updateEntity(RefNationalityTypes e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refNationalityTypesId) {
        return super.deleteEntity(findById(refNationalityTypesId));
    }

}
