package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefCustCats;
import com.info.sak.lookup.repository.RefCustCatsRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class RefCustCatsService extends BaseService<RefCustCats, Integer>{
	private RefCustCatsRepository refCustCatsRepository;
	@Override
	public BaseRepository<Integer, RefCustCats> getBaseRepository() {
		return refCustCatsRepository;
	}
	
	public List<RefCustCats> listAll() {
        return refCustCatsRepository.findAll();
    }
	
	public RefCustCats createEntity(RefCustCats refCustCats) {
		refCustCats.setId(refCustCatsRepository.getCurrentSeqValue());
        return refCustCatsRepository.save(refCustCats);
    }
	
	public RefCustCats findById(Integer refCustCatsId) {
        Optional<RefCustCats> refCustCatsOptional = refCustCatsRepository.findById(refCustCatsId);
        if (refCustCatsOptional.isPresent()) {
            return refCustCatsOptional.get();
        }
        return null;
    }
	@Override
    public RefCustCats updateEntity(RefCustCats e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refCustCatsId) {
        return super.deleteEntity(findById(refCustCatsId));
    }

}
