package com.info.sak.lookup.service;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.FacilityData;
import com.info.sak.lookup.repository.FacilityDataRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FacilityDataService extends BaseService<FacilityData, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -168592864751962829L;
	private FacilityDataRepository facilityDataRepository;

    @Override
    public FacilityDataRepository getBaseRepository() {
        return facilityDataRepository;
    }
}
