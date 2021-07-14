package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefFunctionDto extends BaseDto<Integer> implements Serializable {

    private static final long serialVersionUID = 7938757176940164627L;

    private String code;
    private String nameAr;
    private String nameEn;
    private String functionType;
    private Boolean useEmail;
    private Boolean useSms;
    private String functionUrl;
    private String imageUrl;
    private Boolean enabled;
    private Long sortOrder;
    private RefFunctionCategoryDto functionCategory;
    private List<RefResourcesFunctionDto> resourcesList;
}
