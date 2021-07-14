package com.info.sak.lookup.support.dto;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefRequestSourceDto extends BaseDto<Integer> implements Serializable {

    private String requestSourceDesc;
}
