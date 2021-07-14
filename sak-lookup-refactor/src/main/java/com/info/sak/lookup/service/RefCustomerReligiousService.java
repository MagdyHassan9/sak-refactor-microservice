package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefCustomerReligious;
import com.info.sak.lookup.repository.RefCustomerReligiousRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefCustomerReligiousService extends BaseService<RefCustomerReligious, Integer>{
    private RefCustomerReligiousRepository refCustomerReligiousRepository;
	@Override
	public BaseRepository<Integer, RefCustomerReligious> getBaseRepository() {
		return refCustomerReligiousRepository;
	}
	public List<RefCustomerReligious> listAll() {
        return refCustomerReligiousRepository.findAll();
    }
	
	public RefCustomerReligious createEntity(RefCustomerReligious refCustomerReligious) {
		refCustomerReligious.setId(refCustomerReligiousRepository.getCurrentSeqValue());
        return refCustomerReligiousRepository.save(refCustomerReligious);
    }
	
	public RefCustomerReligious findById(Integer refCustomerReligiousId) {
        Optional<RefCustomerReligious> refCustomerReligiousOptional = refCustomerReligiousRepository.findById(refCustomerReligiousId);
        if (refCustomerReligiousOptional.isPresent()) {
            return refCustomerReligiousOptional.get();
        }
        return null;
    }
	@Override
    public RefCustomerReligious updateEntity(RefCustomerReligious e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refCustomerReligiousId) {
        return super.deleteEntity(findById(refCustomerReligiousId));
    }


}
