package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefCustStatus;
import com.info.sak.lookup.repository.RefCustStatusRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefCustStatusService extends BaseService<RefCustStatus, Integer>{
	private RefCustStatusRepository refCustStatusRepository;
	@Override
	public BaseRepository<Integer, RefCustStatus> getBaseRepository() {
		return refCustStatusRepository;
	}
	
	public List<RefCustStatus> listAll() {
        return refCustStatusRepository.findAll();
    }
	
	public RefCustStatus createEntity(RefCustStatus refCustStatus) {
		refCustStatus.setId(refCustStatusRepository.getCurrentSeqValue());
        return refCustStatusRepository.save(refCustStatus);
    }
	
	public RefCustStatus findById(Integer refCustStatusId) {
        Optional<RefCustStatus> refCustStatusOptional = refCustStatusRepository.findById(refCustStatusId);
        if (refCustStatusOptional.isPresent()) {
            return refCustStatusOptional.get();
        }
        return null;
    }
	@Override
    public RefCustStatus updateEntity(RefCustStatus e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refCustStatusId) {
        return super.deleteEntity(findById(refCustStatusId));
    }

}
