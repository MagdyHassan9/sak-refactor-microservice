package com.info.sak.lookup.support.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.RefFunctionCategory;
import com.info.sak.lookup.service.RefFunctionCategoryService;
import com.info.sak.lookup.support.dto.RefFunctionCategoryDto;
import com.info.sak.lookup.support.mapper.RefFunctionCategoryMapper;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
public class RefFunctionCategoryHandler {

    private RefFunctionCategoryMapper refFunctionCategoryMapper;
    private RefFunctionCategoryService functionCategoryService;

    public List<RefFunctionCategoryDto> handleRefFunctionCategoryRemoveNestedObject(List<RefFunctionCategory> functionCategoryList) {
        List<RefFunctionCategoryDto> functionCategoryDtoList = new ArrayList<>();
        functionCategoryList.forEach(functionCategory -> functionCategoryDtoList.add(handleRefFunctionCategoryRemoveNestedObject(functionCategory)));
        return functionCategoryDtoList;
    }

    public RefFunctionCategoryDto handleRefFunctionCategoryRemoveNestedObject(RefFunctionCategory functionCategory) {
        RefFunctionCategoryDto dto = refFunctionCategoryMapper.toDto(functionCategory);
//        if (functionCategory.getParentFunctionCategory() != null) {
//            dto.setParentFunctionCategory(refFunctionCategoryMapper.toDto(functionCategoryService.findById(functionCategory.getParentFunctionCategory().getId())));
//        }
        return dto;
    }
}
