package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefTransactionCustTypesDto extends BaseDto<Integer> {

    private Long transactionId;
    private Long custTypeId;
    private Boolean approveSecondParty;
    private Long partyId;
    private Boolean approveFirstParty;
    private Boolean showFirstClassRelation;
    private Long expirationPeriod;
    private Boolean percentField;
    private Long percent;
    private Boolean showSecondClassRelation;
    private Boolean showThirdClassRelation;
    private Boolean showFourthClassRelation;

}
