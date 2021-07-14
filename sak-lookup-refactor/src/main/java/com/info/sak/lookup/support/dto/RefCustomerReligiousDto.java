package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefCustomerReligiousDto extends BaseDto<Integer> implements Serializable {
	private String religiousCode;
	private String religiousDesc;
	private Long gender;
	private Long sortOrder;
}
