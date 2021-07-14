package com.info.sak.lookup.support.response.base;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class SuccessPageResponse<id extends Serializable, T extends BaseDto<id>> extends BaseResponse {
    private List<T> responseContent;
    private Long totalElement;

    public SuccessPageResponse(List<T> responseContent, Long totalElement) {
        super();
        this.responseContent = responseContent;
        this.totalElement = totalElement;
    }


}
