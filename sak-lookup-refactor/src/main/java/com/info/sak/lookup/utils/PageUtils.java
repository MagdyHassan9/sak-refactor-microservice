package com.info.sak.lookup.utils;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.info.sak.lookup.entity.base.DomainEntity;

@Component
public class PageUtils<T extends DomainEntity> {

    public PageUtils() {
    }

    public Page<T> convertListToPage(List<T> list, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        int start = (int) pageable.getOffset();
        int end = start + pageable.getPageSize() > list.size() ? list.size() : start + pageable.getPageSize();
        if (list.size()<start){
            return new PageImpl(list.subList(0, 0), pageable, list.size());
        }
            return new PageImpl(list.subList(start, end), pageable, list.size());

    }
}