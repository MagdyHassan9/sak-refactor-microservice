package com.info.sak.lookup.support.mapper;

import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.FacilityData;
import com.info.sak.lookup.support.dto.FacilityDataDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {FdBranchesMapper.class,
        FdEstablishmentPartnersMapper.class, FdHumanPartnersMapper.class,
        FdSignatoriesMapper.class})
public interface FacilityDataMapper extends BaseMapper<Integer, FacilityData, FacilityDataDto> {


}
