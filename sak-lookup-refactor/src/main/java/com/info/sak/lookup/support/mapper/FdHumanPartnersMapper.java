package com.info.sak.lookup.support.mapper;
import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.FdHumanPartners;
import com.info.sak.lookup.support.dto.FdHumanPartnersDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {FacilityDataMapper.class})
public interface FdHumanPartnersMapper extends BaseMapper<Integer, FdHumanPartners, FdHumanPartnersDto> {

}
