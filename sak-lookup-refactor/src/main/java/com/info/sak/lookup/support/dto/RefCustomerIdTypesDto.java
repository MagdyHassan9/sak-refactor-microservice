package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefCustomerIdTypesDto extends BaseDto<Integer> implements Serializable {
    private String CustomerIdTypeCode;
    private String CustomerIdTypeDesc;
    private Long sortOrder;
    private Long isFirstProcuration;
    private String CustomerIdTypeDescEn;
    private Integer minValue;
    private Integer maxValue;
    private String acceptanceValue;
    private String errorMessage;
}
