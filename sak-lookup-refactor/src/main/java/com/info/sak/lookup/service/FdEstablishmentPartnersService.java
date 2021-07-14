package com.info.sak.lookup.service;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.FdEstablishmentPartners;
import com.info.sak.lookup.repository.FdEstablishmentPartnersRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FdEstablishmentPartnersService extends BaseService<FdEstablishmentPartners, Integer> {

    private FdEstablishmentPartnersRepository establishmentPartnersRepository;

    @Override
    public FdEstablishmentPartnersRepository getBaseRepository() {
        return establishmentPartnersRepository;
    }
}
