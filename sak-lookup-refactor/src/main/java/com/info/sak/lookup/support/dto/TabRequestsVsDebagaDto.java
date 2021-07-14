package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.entity.RefDebagaTemplate;
import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class TabRequestsVsDebagaDto extends BaseDto<Integer> implements Serializable {
    private RefDebagaTemplate refDebagaTemplate;
    private Long sortOrder;
    private String text;
    private Long groupNo;
}
