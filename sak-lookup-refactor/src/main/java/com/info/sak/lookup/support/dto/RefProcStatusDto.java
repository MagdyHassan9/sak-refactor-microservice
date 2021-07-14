package com.info.sak.lookup.support.dto;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;


@Data
public class RefProcStatusDto extends BaseDto<Integer> {

    private String statusCode;
    private String statusDesc;
    private Long sortOrder;

}
