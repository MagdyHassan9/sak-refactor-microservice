package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.Date;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class TabDebagaDto extends BaseDto<Integer> implements Serializable {
    private String text;
    private String textExtension;
    private Date textDate;
    private Date textUpdates;
    private TabRequestsDto tabRequests;
}
