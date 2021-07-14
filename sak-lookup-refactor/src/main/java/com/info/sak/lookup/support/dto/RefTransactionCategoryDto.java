package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;
@Data
public class RefTransactionCategoryDto extends BaseDto<Integer> implements Serializable {
    private String categoryCode;
    private String categoryDesk;
    private Long appearStatus;
    private Long sortOrder;
    private RefTransactionCategoryDto refTransactionCategory;
    private String deskEn;
    private List<RefTransactionCategoryDto> IssueTypeCategoryList;
    private List<RefTransactionCategoryDto> transactionCategoryList;


}
