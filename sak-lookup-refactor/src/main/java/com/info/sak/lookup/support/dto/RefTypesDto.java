package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefTypesDto extends BaseDto<Integer> {
    private String transactionTypeCode;
    private Byte transactionTypeCategory;
    private String transactionTypeDesc;
    private Boolean transactionTypeFlag;
    private Boolean custFrom;
    private Boolean custTo;
    private Boolean custWitt;
    private Boolean oldProc;
    private Boolean signs;
    private Boolean templete;
    private Boolean selling;
    private Boolean acknowledgment;
    private Boolean manualTransFlag;
    private Boolean flag;
    private Short sortOrder;
    private Boolean isMultiDebaga;
    private String transactionTypeDescEn;
    private String transactionReport;

}
