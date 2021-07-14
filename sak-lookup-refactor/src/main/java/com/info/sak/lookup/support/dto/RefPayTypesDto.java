package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefPayTypesDto extends BaseDto<Integer> {

    private String payTypeCode;
    private String payTypeDesc;

}
