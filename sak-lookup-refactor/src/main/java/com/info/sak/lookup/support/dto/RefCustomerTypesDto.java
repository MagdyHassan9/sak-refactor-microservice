package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefCustomerTypesDto extends BaseDto<Integer> implements Serializable {
	private String customerTypeCode;
	private String customerTypeDesc;
    private Long sortOrder;

}
