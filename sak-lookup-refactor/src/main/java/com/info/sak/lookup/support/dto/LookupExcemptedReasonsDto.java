package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class LookupExcemptedReasonsDto extends BaseDto<Integer> implements Serializable {

    private String reasonCode;
    private String reasonDesc;
    private Short sortOrder;

}
