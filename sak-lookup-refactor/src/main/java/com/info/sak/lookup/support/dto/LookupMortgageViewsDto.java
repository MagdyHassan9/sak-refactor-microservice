package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class LookupMortgageViewsDto extends BaseDto<Integer> implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1307481224947881579L;
	private Long transactionTypeId;
    private String viewName;
    private String key;
    private Long debagaId;
    private Long saleDebagaId;
    private Long saleTransactionTypeId;

}
