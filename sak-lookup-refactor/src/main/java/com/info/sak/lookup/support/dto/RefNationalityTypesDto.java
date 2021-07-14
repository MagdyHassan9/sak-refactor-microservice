package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;
@Data
public class RefNationalityTypesDto extends BaseDto<Integer> implements Serializable {
	private Long nationalityTypeNo;
	private String nationalityTypeCode;
	private String nationalityTypeDesc;
	private Long gender;
	private Long sortOrder;
    private Long integrationId;
    private Long status;
    private String nationalityTypeDescEn;
	private String nationalityFemale;
	private String nationalityMale;
}
