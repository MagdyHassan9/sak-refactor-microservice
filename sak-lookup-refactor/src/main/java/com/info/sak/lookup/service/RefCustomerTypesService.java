package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefCustomerTypes;
import com.info.sak.lookup.repository.RefCustomerTypesRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

@Service
public class RefCustomerTypesService extends BaseService<RefCustomerTypes, Integer>{
	private RefCustomerTypesRepository refCustomerTypesRepository;
	@Override
	public BaseRepository<Integer, RefCustomerTypes> getBaseRepository() {
		return refCustomerTypesRepository;
	}
	
	public List<RefCustomerTypes> listAll() {
        return refCustomerTypesRepository.findAll();
    }
	
	public RefCustomerTypes createEntity(RefCustomerTypes refCustomerTypes) {
		refCustomerTypes.setId(refCustomerTypesRepository.getCurrentSeqValue());
        return refCustomerTypesRepository.save(refCustomerTypes);
    }
	
	public RefCustomerTypes findById(Integer refCustomerTypesId) {
        Optional<RefCustomerTypes> refCustomerTypesOptional = refCustomerTypesRepository.findById(refCustomerTypesId);
        if (refCustomerTypesOptional.isPresent()) {
            return refCustomerTypesOptional.get();
        }
        return null;
    }
	@Override
    public RefCustomerTypes updateEntity(RefCustomerTypes e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refCustomerTypesId) {
        return super.deleteEntity(findById(refCustomerTypesId));
    }

}
