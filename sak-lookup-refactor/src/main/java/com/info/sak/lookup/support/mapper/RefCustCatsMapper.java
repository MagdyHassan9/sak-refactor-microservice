package com.info.sak.lookup.support.mapper;



import org.mapstruct.Mapper;

import com.info.sak.lookup.entity.RefCustCats;
import com.info.sak.lookup.support.dto.RefCustCatsDto;
import com.info.sak.lookup.support.mapper.base.BaseMapper;

@Mapper(componentModel = "spring")
public interface RefCustCatsMapper extends BaseMapper<Integer, RefCustCats, RefCustCatsDto>{
	RefCustCatsDto toDto(RefCustCats entity);
}
