package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class FdEstablishmentPartnersDto extends BaseDto<Integer> {

    /**
	 * 
	 */
	private static final long serialVersionUID = -9205867571251911371L;
	private String commercialName;
    private String nationality;
    private String commercialRegistrationCode;
    private Long percentage;
    private String partnerTypeCode;
    private String partnerTypeDesc;
    private FacilityDataDto facilityData;

}
