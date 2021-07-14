package com.info.sak.lookup.support.dto;

import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class SakGroupsDto extends BaseDto<Integer> {

    List<SakGroupsFunctionDto> groupsFunctionList;
    private String code;
    private String nameAr;
    private String nameEn;
    private Integer enabled;


}
