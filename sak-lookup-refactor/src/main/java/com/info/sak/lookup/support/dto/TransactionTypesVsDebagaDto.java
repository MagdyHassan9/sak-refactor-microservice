package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;
@Data
public class TransactionTypesVsDebagaDto extends BaseDto<Integer> implements Serializable {

    RefDebagaTemplateDto refDebagaTemplate;
    private Long sortOrder;
    private Long transactionTypeId;


}
