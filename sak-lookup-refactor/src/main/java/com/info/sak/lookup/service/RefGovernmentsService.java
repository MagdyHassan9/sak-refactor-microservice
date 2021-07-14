package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefGovernments;
import com.info.sak.lookup.repository.RefGovernmentsRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefGovernmentsService extends BaseService<RefGovernments, Integer>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1065721869752260419L;
	private RefGovernmentsRepository refGovernmentsRepository;
	@Override
	public BaseRepository<Integer, RefGovernments> getBaseRepository() {
		return refGovernmentsRepository;
	}
	
	public List<RefGovernments> listAll() {
        return refGovernmentsRepository.findAll();
    }
	
	public RefGovernments createEntity(RefGovernments refGovernments) {
		refGovernments.setId(refGovernmentsRepository.getCurrentSeqValue());
        return refGovernmentsRepository.save(refGovernments);
    }
	
	public RefGovernments findById(Integer refGovernmentsId) {
        Optional<RefGovernments> refGovernmentsOptional = refGovernmentsRepository.findById(refGovernmentsId);
        if (refGovernmentsOptional.isPresent()) {
            return refGovernmentsOptional.get();
        }
        return null;
    }
	@Override
    public RefGovernments updateEntity(RefGovernments e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refGovernmentsId) {
        return super.deleteEntity(findById(refGovernmentsId));
    }

}

