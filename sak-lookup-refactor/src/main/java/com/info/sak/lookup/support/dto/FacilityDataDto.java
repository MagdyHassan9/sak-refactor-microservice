package com.info.sak.lookup.support.dto;

import java.sql.Timestamp;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class FacilityDataDto extends BaseDto<Integer> {

    public String commercialRegister;
    public String facilityNo;
    public String facilityName;
    public String postalBox;
    public String tel;
    public Timestamp expiryDate;
    public String percentage;
    public String branchNumber;
    private List<FdBranchesDto> branchesList;
    private List<FdEstablishmentPartnersDto> establishmentPartnersList;
    private List<FdHumanPartnersDto> humanPartnersList;
    private List<FdSignatoriesDto> signatoriesList;

}
