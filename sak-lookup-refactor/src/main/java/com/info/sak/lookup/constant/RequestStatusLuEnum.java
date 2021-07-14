/**
 * 
 */
package com.info.sak.lookup.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mohatiea
 * @created Jul 12, 2015 - 3:08:17 PM
 */
public enum RequestStatusLuEnum {

	DRAFT("DRAFT"), PENDING_PAYMENT("PENDING_PAYMENT"), PENDING_APPROVAL("PENDING_APPROVAL"), COMPLETED("COMPLETED"), 
	CANCELED ("CANCELED") , REJECTED("REJECTED"), CONTINUE_FROM_OFFICE("CONTINUE_FROM_OFFICE"),PENDING_CUSTOMER_APPROVAL("PENDING_CUSTOMER_APPROVAL"),EXPIRED("EXPIRED"), 
	PENDING("PENDING"), REJECTED_MINISTRY("REJECTED_MINISTRY"), APPROVED_MINISTRY("APPROVED_MINISTRY"), PENDING_MINISTRY_APPROVAL("PENDING_MINISTRY_APPROVAL"),REJECTED_BY_REVIEWER("REJECTED_BY_REVIEWER"),
	STOPPED("STOPPED");

	private String statusCode;

	RequestStatusLuEnum(String statusCode) {
		this.statusCode = statusCode;
	}

	public static RequestStatusLuEnum getByStatusCode(String statusCode) {
		if (StringUtils.isNoneBlank(statusCode)) {
			for (RequestStatusLuEnum requestStatusLuEnum : RequestStatusLuEnum.values()) {
				if (statusCode.equals(requestStatusLuEnum.getStatusCode())) {
					return requestStatusLuEnum;
				}
			}
		}
		return null;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	

    public String getKeyValuePrefix() {
		return "request_status.";
	}
    
}
