package com.info.sak.lookup.service;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefReqCustTypeCat;
import com.info.sak.lookup.repository.RefReqCustTypeCatRepository;
import com.info.sak.lookup.repository.base.BaseRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RefReqCustTypeCatService extends BaseService<RefReqCustTypeCat, Integer>  {
    /**
	 * 
	 */
	private static final long serialVersionUID = -14630035992181108L;
	private RefReqCustTypeCatRepository refReqCustTypeCatRepository;

    @Override
    public BaseRepository<Integer, RefReqCustTypeCat> getBaseRepository() {
        return refReqCustTypeCatRepository;
    }

    @Override
    public RefReqCustTypeCat createEntity(RefReqCustTypeCat e) {
        e.setId(refReqCustTypeCatRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }
    public Boolean deleteEntity(Integer refRequestId) {
        return super.deleteEntity(findById(refRequestId));
    }
}
