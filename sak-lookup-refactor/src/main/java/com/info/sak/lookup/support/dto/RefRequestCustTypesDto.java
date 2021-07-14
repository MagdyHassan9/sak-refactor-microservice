package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;
@Data
public class RefRequestCustTypesDto extends BaseDto<Integer> implements Serializable {
    private String custTypeCode;
    private String custTypeDesc;
    private Long sortOrder;
    private String custTypeDescEn;
    private List<RefReqCustTypeCatDto> refReqCustTypeCatList;
}
