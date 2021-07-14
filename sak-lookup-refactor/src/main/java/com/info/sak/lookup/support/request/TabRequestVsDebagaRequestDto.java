package com.info.sak.lookup.support.request;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.support.dto.TabRequestsVsDebagaDto;
import com.info.sak.lookup.support.dto.base.BaseDto;

public class TabRequestVsDebagaRequestDto extends BaseDto<Integer> implements Serializable {

    private static final long serialVersionUID = -2804761889256452777L;
    private List<TabRequestsVsDebagaDto> requestDebagaList;

    public List<TabRequestsVsDebagaDto> getRequestDebagaList() {
        return requestDebagaList;
    }

    public void setRequestDebagaList(List<TabRequestsVsDebagaDto> requestDebagaList) {
        this.requestDebagaList = requestDebagaList;
    }
}
