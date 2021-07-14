package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefCustomerGenderDto extends BaseDto<Integer> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2233022642320669284L;
	private String genderCode;
    private String genderDesc;
    private Long sortOrder;


}
