package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.FdBranches;
import com.info.sak.lookup.support.dto.FdBranchesDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {FacilityDataMapper.class})
public interface FdBranchesMapper extends BaseMapper<Integer, FdBranches, FdBranchesDto> {
}
