package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefIssueCategory;
import com.info.sak.lookup.support.dto.RefIssueCategoryDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;


@Mapper(componentModel = "spring")
public interface RefIssueCategoryMapper extends BaseMapper<Integer, RefIssueCategory, RefIssueCategoryDto> {
    @Override
    RefIssueCategoryDto toDto(RefIssueCategory entity);

}