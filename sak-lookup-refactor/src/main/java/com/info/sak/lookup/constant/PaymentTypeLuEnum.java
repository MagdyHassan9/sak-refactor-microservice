package com.info.sak.lookup.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author moibrahim
 * @created Aug 6, 2015 - 4:58:20 PM
 */
public enum PaymentTypeLuEnum {

	PERSONS_FEES("PERSONS_FEES"),COPY_FEES("COPY_FEES"),CATEGORY_FEES("CATEGORY_FEES");
	
	private String paymentTypeCode ;
	
	
	PaymentTypeLuEnum(String paymentTypeCode)
	{
		this.setPaymentTypeCode(paymentTypeCode);
	}
	
	public PaymentTypeLuEnum getPaymentTypeByCode(String paymentTypeCode) 
	{
		if(StringUtils.isNoneBlank(paymentTypeCode))
		{
		
			for(PaymentTypeLuEnum paymentTypeEnum :PaymentTypeLuEnum.values())
			{
				if(paymentTypeCode.equals(paymentTypeEnum.getPaymentTypeCode())) {
					return paymentTypeEnum ;
				}
			}
		}
		return null ;
	}

	/**
	 * @return the paymentTypeCode
	 */
	public String getPaymentTypeCode() {
		return paymentTypeCode;
	}

	/**
	 * @param paymentTypeCode the paymentTypeCode to set
	 */
	public void setPaymentTypeCode(String paymentTypeCode) {
		this.paymentTypeCode = paymentTypeCode;
	}
}
