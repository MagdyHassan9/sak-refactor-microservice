package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefNationalityTypesTableDto extends BaseDto<Integer> implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 7762153167392396745L;
	private String nationalityTypeCode;
    private String nationalityTypeDesc;
    private long gender;
    private long sortOrder;
    private long integrationId;
    private String nationalityMale;
    private String nationalityFeMale;
    private String nationalityTypeDescEn;
    private long status; 
}
