package com.info.sak.lookup.support.response.base;

public class BaseResponse {
    private Boolean errorStatus;

    public BaseResponse() {
        this.errorStatus = false;
    }

    public BaseResponse(Boolean errorStatus) {
        this.errorStatus = errorStatus;
    }

    public Boolean getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(Boolean errorStatus) {
        this.errorStatus = errorStatus;
    }
}
