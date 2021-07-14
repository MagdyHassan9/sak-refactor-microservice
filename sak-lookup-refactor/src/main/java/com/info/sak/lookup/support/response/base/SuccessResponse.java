package com.info.sak.lookup.support.response.base;

import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class SuccessResponse<id extends Serializable, T extends BaseDto<id>> extends BaseResponse {
    private T baseDto;

    public SuccessResponse(T baseDto) {
        super();
        this.baseDto = baseDto;
    }

    public SuccessResponse() {
        super();
    }
}
