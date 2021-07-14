package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;


@Data
public class LookupRequestStatusDto extends BaseDto<Integer> implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4588457127143470836L;
	private String code;
    private Byte sortOrder;
    private String description;
    private String descriptionEn;

}
