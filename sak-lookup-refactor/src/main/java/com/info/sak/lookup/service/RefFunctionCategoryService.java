package com.info.sak.lookup.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefFunctionCategory;
import com.info.sak.lookup.repository.RefFunctionCategoryRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefFunctionCategoryService extends BaseService<RefFunctionCategory, Integer> {

    private RefFunctionCategoryRepository functionCategoryRepository;


    @Override
    public RefFunctionCategoryRepository getBaseRepository() {
        return functionCategoryRepository;
    }

    public RefFunctionCategory createEntity(RefFunctionCategory functionCategory) {
        functionCategory.setId(functionCategoryRepository.getCurrentSeqValue());
        return functionCategoryRepository.save(functionCategory);
    }


    public List<RefFunctionCategory> listAll() {
        return functionCategoryRepository.findAll();
    }

    public RefFunctionCategory findById(Integer refCategoryId) {
        Optional<RefFunctionCategory> refFunctionCategoryOptional = functionCategoryRepository.findById(refCategoryId);
        if (refFunctionCategoryOptional.isPresent()) {
            return refFunctionCategoryOptional.get();
        }
        return null;
    }

    @Override
    public RefFunctionCategory updateEntity(RefFunctionCategory e) {
        return super.updateEntity(e);
    }
}
