package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class SakGroupsFunctionDto extends BaseDto<Integer> {
    private Boolean enabled;
    private SakGroupsDto sakGroups;
    private RefFunctionDto function;
    private RefResourcesFunctionDto resourcesFunction;

}
