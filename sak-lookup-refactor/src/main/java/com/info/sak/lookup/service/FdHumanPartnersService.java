package com.info.sak.lookup.service;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.FdHumanPartners;
import com.info.sak.lookup.repository.FdHumanPartnersRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FdHumanPartnersService extends BaseService<FdHumanPartners, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7051959922587148627L;
	private FdHumanPartnersRepository humanPartnersRepository;

    @Override
    public FdHumanPartnersRepository getBaseRepository() {
        return humanPartnersRepository;
    }
}
