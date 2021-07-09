package com.info.sak.lookup.repository;

import org.springframework.stereotype.Repository;

import com.info.sak.lookup.entity.FacilityData;
import com.info.sak.lookup.repository.base.BaseRepository;

@Repository
public interface FacilityDataRepository extends BaseRepository<Integer, FacilityData> {
}
