package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefDebagaTemplate;
import com.info.sak.lookup.repository.RefDebagaTemplateRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefDebagaTemplateService extends BaseService<RefDebagaTemplate, Integer> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -299890970048162026L;
	private RefDebagaTemplateRepository refDebagaTemplateRepository;
 
    @Override
    public BaseRepository<Integer, RefDebagaTemplate> getBaseRepository() {
        return refDebagaTemplateRepository;
    }

    public List<RefDebagaTemplate> listAll() {
        return refDebagaTemplateRepository.findAll();
    }

    public RefDebagaTemplate createEntity(RefDebagaTemplate refDebagaTemplate) {
        refDebagaTemplate.setId(refDebagaTemplateRepository.getCurrentSeqValue());
        return refDebagaTemplateRepository.save(refDebagaTemplate);
    }

    public RefDebagaTemplate findById(Integer refDebagaTemplateId) {
        Optional<RefDebagaTemplate> refDebagaTemplateOptional = refDebagaTemplateRepository.findById(refDebagaTemplateId);
        if (refDebagaTemplateOptional.isPresent()) {
            return refDebagaTemplateOptional.get();
        }
        return null;
    }

    @Override
    public RefDebagaTemplate updateEntity(RefDebagaTemplate e) {
        return super.updateEntity(e);
    }

    public Boolean deleteEntity(Integer refDebagaTemplateId) {
        return super.deleteEntity(findById(refDebagaTemplateId));
    }

  
}

