package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;


@Data
public class RefPeriodDto extends BaseDto<Integer> {

    private Long periodTypeId;
    private Long periodTypeValue;

}
