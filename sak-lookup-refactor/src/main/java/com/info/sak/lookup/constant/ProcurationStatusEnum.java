/**
 * 
 */
package com.info.sak.lookup.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * @author moibrahim
 * @created Nov 2, 2015 - 1:05:51 PM
 */
public enum ProcurationStatusEnum {

	CANCELLED("CANCELLED"), VALID("VALID"), INVALID("INVALID"), DELETED("DELETED"), EXPIRED("EXPIRED") , TREEDISMISS("TREEDISMISS"),
	POA_CAN_EXTERNAL_USE("POA_CAN_EXTERNAL_USE"),POA_CAN_DELETE("POA_CAN_DELETE") , POA_CAN_DELEGATE("POA_CAN_DELEGATE");
	
	private String statusCode;
	
	ProcurationStatusEnum(String statusCode)
	{
		this.setStatusCode(statusCode);
	}

	public ProcurationStatusEnum getStatusEnumByCode(String statusCode)
	{
		if(StringUtils.isNoneBlank(statusCode))
		{
			for(ProcurationStatusEnum statusEnum : ProcurationStatusEnum.values())
			{
				if(statusCode.equals(statusEnum.getStatusCode()))
				{
					return statusEnum;
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

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
}
