package com.info.sak.lookup.support.response.base;

import java.util.Map;

import lombok.Data;
@Data
public class ErrorResponse extends BaseResponse {
    private Map<String , String > errorMap;

    public ErrorResponse( Map<String, String> errorMap) {
        super(true);
        this.errorMap = errorMap;
    }
}
