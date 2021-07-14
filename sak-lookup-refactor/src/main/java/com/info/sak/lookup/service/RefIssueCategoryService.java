package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefIssueCategory;
import com.info.sak.lookup.repository.RefIssueCategoryRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefIssueCategoryService extends BaseService<RefIssueCategory, Integer>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4013126011616733140L;
	private RefIssueCategoryRepository refIssueCategoryRepository;
	@Override
	public BaseRepository<Integer, RefIssueCategory> getBaseRepository() {
		return refIssueCategoryRepository;
	}
	
	public List<RefIssueCategory> listAll() {
        return refIssueCategoryRepository.findAll();
    }
	
	public RefIssueCategory createEntity(RefIssueCategory refIssueCategory) {
		refIssueCategory.setId(refIssueCategoryRepository.getCurrentSeqValue());
        return refIssueCategoryRepository.save(refIssueCategory);
    }
	
	public RefIssueCategory findById(Integer refIssueCategoryId) {
        Optional<RefIssueCategory> refIssueCategoryOptional = refIssueCategoryRepository.findById(refIssueCategoryId);
        if (refIssueCategoryOptional.isPresent()) {
            return refIssueCategoryOptional.get();
        }
        return null;
    }
	@Override
    public RefIssueCategory updateEntity(RefIssueCategory e) {
        return super.updateEntity(e);
    }
	
	public Boolean deleteEntity(Integer refIssueCategoryId) {
        return super.deleteEntity(findById(refIssueCategoryId));
    }

}
