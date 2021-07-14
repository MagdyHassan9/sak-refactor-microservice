package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefFunction;
import com.info.sak.lookup.repository.RefFunctionRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefFunctionService extends BaseService<RefFunction, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5965038852473544723L;
	private RefFunctionRepository functionRepository;

    @Override
    public RefFunctionRepository getBaseRepository() {
        return functionRepository;
    }

    public List<RefFunction> listAll() {
        return functionRepository.findAll();
    }

    public RefFunction createEntity(RefFunction refFunction) {
        refFunction.setId(functionRepository.getCurrentSeqValue());
        return functionRepository.save(refFunction);
    }

    public RefFunction findById(Integer refFunctionId) {
        Optional<RefFunction> refFunctionOptional = functionRepository.findById(refFunctionId);
        if (refFunctionOptional.isPresent()) {
            return refFunctionOptional.get();
        }
        return null;
    }

    @Override
    public RefFunction updateEntity(RefFunction e) {
        return super.updateEntity(e);
    }

    public Boolean deleteEntity(Integer refFunctionId) {
        return super.deleteEntity(findById(refFunctionId));
    }
}
