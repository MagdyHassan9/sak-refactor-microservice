package com.info.sak.lookup.service;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.FdBranches;
import com.info.sak.lookup.repository.FdBranchesRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FdBranchesService extends BaseService<FdBranches, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3961310636255926887L;
	private FdBranchesRepository branchesRepository;

    @Override
    public FdBranchesRepository getBaseRepository() {
        return branchesRepository;
    }
}
