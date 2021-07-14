package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class LookupReviewerTypeDto extends BaseDto<Integer> implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6461343703817727931L;
	private String name;
    private String code;
    private Long sortOrder;

}
