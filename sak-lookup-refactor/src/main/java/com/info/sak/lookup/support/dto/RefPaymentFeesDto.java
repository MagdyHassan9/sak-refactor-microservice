package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefPaymentFeesDto extends BaseDto<Integer> {
    private Short transactionTypeId;
    private Boolean oss;
    private Long fees;
    private Short sortOrder;
    private Boolean forFirstParty;
    private Boolean forSecondParty;
    private Long fees1;
    private Long fees2;
    private Long fees3;
    private Long fees4;

}
