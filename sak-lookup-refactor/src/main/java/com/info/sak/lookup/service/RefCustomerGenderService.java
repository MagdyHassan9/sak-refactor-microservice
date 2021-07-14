package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefCustomerGender;
import com.info.sak.lookup.repository.RefCustomerGenderRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefCustomerGenderService extends BaseService<RefCustomerGender, Integer>{
	private RefCustomerGenderRepository refCustomerGenderRepository;
	@Override
	public BaseRepository<Integer, RefCustomerGender> getBaseRepository() {
		return refCustomerGenderRepository;
	}
	
	public List<RefCustomerGender> listAll() {
        return refCustomerGenderRepository.findAll();
    }
	
	public RefCustomerGender createEntity(RefCustomerGender refCustomerGender) {
		refCustomerGender.setId(refCustomerGenderRepository.getCurrentSeqValue());
        return refCustomerGenderRepository.save(refCustomerGender);
    }
	
	public RefCustomerGender findById(Integer refCustomerGenderId) {
        Optional<RefCustomerGender> refCustomerGenderOptional = refCustomerGenderRepository.findById(refCustomerGenderId);
        if (refCustomerGenderOptional.isPresent()) {
            return refCustomerGenderOptional.get();
        }
        return null;
    }
	@Override
    public RefCustomerGender updateEntity(RefCustomerGender e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refCustomerGenderId) {
        return super.deleteEntity(findById(refCustomerGenderId));
    }

}
