package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefResourcesFunctionDto extends BaseDto<Integer> {

    private String resourcesNameAr;
    private String resourcesNameEn;
    private String resourcesCode;
    private RefFunctionDto function;
}
