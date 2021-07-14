package com.info.sak.lookup.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.info.sak.lookup.entity.RefPaymentFees;
import com.info.sak.lookup.repository.RefPaymentFeesRepository;
import com.info.sak.lookup.service.base.BaseService;

import lombok.Data;

@Service
@Data
public class RefPaymentFeesService extends BaseService<RefPaymentFees, Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8320123832372967960L;
	private RefPaymentFeesRepository paymentFeesRepository;

    @Override
    public RefPaymentFeesRepository getBaseRepository() {
        return paymentFeesRepository;
    }

    @Override
    public RefPaymentFees createEntity(RefPaymentFees e) {
        e.setId(paymentFeesRepository.getCurrentSeqValue());
        return super.createEntity(e);
    }

    @Override
    public RefPaymentFees findById(Integer entityId) {
        Optional<RefPaymentFees> paymentFeesOptional = paymentFeesRepository.findById(entityId);
        return paymentFeesOptional.isPresent() ? paymentFeesOptional.get() : null;
    }

    public Boolean deleteEntity(Integer entityId) {
        return super.deleteEntity(findById(entityId));
    }

}
