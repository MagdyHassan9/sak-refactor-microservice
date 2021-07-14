package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefFunctionCategoryDto extends BaseDto<Integer> implements Serializable {

    private static final long serialVersionUID = -1032009084157385524L;

    private String nameAr;
    private String nameEn;
    private Long moduleId;
    private String enabled;
    private Long sortOrder;
    private String code;
    private String imageUrl;
    private RefFunctionCategoryDto parentFunctionCategory;
    private List<RefFunctionCategoryDto> children;
    private List<RefFunctionDto> functionList;
}
