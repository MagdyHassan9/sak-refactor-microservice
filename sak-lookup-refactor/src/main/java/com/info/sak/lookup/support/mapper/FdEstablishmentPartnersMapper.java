package com.info.sak.lookup.support.mapper;
import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.FdEstablishmentPartners;
import com.info.sak.lookup.support.dto.FdEstablishmentPartnersDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring", uses = {FacilityDataMapper.class})
public interface FdEstablishmentPartnersMapper extends BaseMapper<Integer, FdEstablishmentPartners, FdEstablishmentPartnersDto> {

}
