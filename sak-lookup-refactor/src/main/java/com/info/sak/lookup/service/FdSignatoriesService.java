package com.info.sak.lookup.service;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.FdSignatories;
import com.info.sak.lookup.repository.FdSignatoriesRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FdSignatoriesService extends BaseService<FdSignatories, Integer> {

    private FdSignatoriesRepository signatoriesRepository;

    @Override
    public FdSignatoriesRepository getBaseRepository() {
        return signatoriesRepository;
    }
}
