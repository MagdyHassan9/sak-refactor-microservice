package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;
@Data
public class RefIssueCategoryDto extends BaseDto<Integer> implements Serializable {

	private String issueTypeCategoryCode;
	private String issueCategoryDesc;
    private Long sortOrder;
    private Long issueAppearStatus;
	private String issueCategoryDescEn;
	

}

