package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class FdBranchesDto extends BaseDto<Integer> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2165765177265826021L;
	private String branchName;
    private String serialNumber;
    private String statusCode;
    private String statusDesc;
    private FacilityDataDto facilityData;
}
