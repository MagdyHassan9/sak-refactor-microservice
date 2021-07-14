package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefCustCatsDto extends BaseDto<Integer> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -626375239057722085L;
	private String catCode;
	private String catDesc;
    private Long sortOrder;
}
