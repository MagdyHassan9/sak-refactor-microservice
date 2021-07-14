package com.info.sak.lookup.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefParticpationType;
import com.info.sak.lookup.repository.RefParticpationTypeRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefParticpationTypeService extends BaseService<RefParticpationType, Integer> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 716673862712021428L;
	private RefParticpationTypeRepository refParticpationTypeRepository;
    @Override
    public BaseRepository<Integer, RefParticpationType> getBaseRepository() {
        return refParticpationTypeRepository;
    }

    public List<RefParticpationType> listAll() {
        return refParticpationTypeRepository.findAll();
    }

    public RefParticpationType createEntity(RefParticpationType refParticpationType) {
        refParticpationType.setId(refParticpationTypeRepository.getCurrentSeqValue());
        return refParticpationTypeRepository.save(refParticpationType);
    }

    public RefParticpationType findById(Integer refParticpationTypeId) {
        Optional<RefParticpationType> refParticpationTypeOptional = refParticpationTypeRepository.findById(refParticpationTypeId);
        if (refParticpationTypeOptional.isPresent()) {
            return refParticpationTypeOptional.get();
        }
        return null;
    }
    @Override
    public RefParticpationType updateEntity(RefParticpationType e) {
        return super.updateEntity(e);
    }

    public Boolean deleteEntity(Integer refParticpationTypeId) {
        return super.deleteEntity(findById(refParticpationTypeId));
    }

}

