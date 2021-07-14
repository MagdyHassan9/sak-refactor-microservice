package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;
@Data
public class RefGovernmentsDto extends BaseDto<Integer> implements Serializable {
	    private Long sortOrder;
	    private String governmentalCode;
	    private Long sortDesc;

}
