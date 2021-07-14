package com.info.sak.lookup.support.dto ;

 

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class FdSignatoriesDto extends BaseDto<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6491020795952578995L;
	private String signatorieName;
	private String nationality;
	private String nIn;
	private String nInTypeCode;
	private String nInTypeDesc;
	private String partnerTypeCode;
	private String partnerTypeDesc;
	private FacilityDataDto facilityData;

}
