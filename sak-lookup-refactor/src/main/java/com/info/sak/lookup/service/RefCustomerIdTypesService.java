package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefCustomerIdTypes;
import com.info.sak.lookup.repository.RefCustomerIdTypesRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefCustomerIdTypesService extends BaseService<RefCustomerIdTypes, Integer>{
	private RefCustomerIdTypesRepository refCustomerIdTypesRepository; 
	@Override
	public BaseRepository<Integer, RefCustomerIdTypes> getBaseRepository() {
		return refCustomerIdTypesRepository; 
	}
	public List<RefCustomerIdTypes> listAll() {
        return refCustomerIdTypesRepository.findAll();
    }
	
	public RefCustomerIdTypes createEntity(RefCustomerIdTypes refCustomerIdTypes) {
		refCustomerIdTypes.setId(refCustomerIdTypesRepository.getCurrentSeqValue());
        return refCustomerIdTypesRepository.save(refCustomerIdTypes);
    }
	
	public RefCustomerIdTypes findById(Integer refCustomerIdTypesId) {
        Optional<RefCustomerIdTypes> refCustomerIdTypesOptional = refCustomerIdTypesRepository.findById(refCustomerIdTypesId);
        if (refCustomerIdTypesOptional.isPresent()) {
            return refCustomerIdTypesOptional.get();
        }
        return null;
    }
	@Override
    public RefCustomerIdTypes updateEntity(RefCustomerIdTypes e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refCustomerIdTypesId) {
        return super.deleteEntity(findById(refCustomerIdTypesId));
    }


}
