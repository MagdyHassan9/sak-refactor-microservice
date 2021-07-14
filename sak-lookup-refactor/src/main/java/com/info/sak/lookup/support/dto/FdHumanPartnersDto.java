package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class FdHumanPartnersDto extends BaseDto<Integer> {

    private String humanName;
    private String nationality;
    private String nIn;
    private String nInTypeCode;
    private String nInTypeDesc;
    private Long percentage;
    private String partnerTypeCode;
    private String partnerTypeDesc;
    private FacilityDataDto facilityData;

}
