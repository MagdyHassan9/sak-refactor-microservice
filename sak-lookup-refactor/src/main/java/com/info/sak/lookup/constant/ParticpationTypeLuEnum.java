/**
 * 
 */
package com.info.sak.lookup.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * @author moibrahim
 * @created Dec 16, 2015 - 5:09:27 PM
 */
public enum ParticpationTypeLuEnum {

	REQUESTER("REQUESTER"), FIRST_PARTY("FIRST_PARTY"), SECOND_PARTY("SECOND_PARTY"), WITNESS("WITNESS");
	
	private String particpationTypeCode;
	
	 ParticpationTypeLuEnum(String particpationTypeCode) 
	{
		this.particpationTypeCode= particpationTypeCode;
	}
	
	public static ParticpationTypeLuEnum getParticpationTypeByCode(String particpationTypeCode)
	{
		if(StringUtils.isNoneEmpty(particpationTypeCode))
		{
			for(ParticpationTypeLuEnum particpationTypeLuEnum: ParticpationTypeLuEnum.values())
			{
				if(particpationTypeCode.equals(particpationTypeLuEnum.getParticpationTypeCode()))
				{
					return particpationTypeLuEnum;
				}
			}
		}
		
		return null;
	}

	/**
	 * @return the particpationTypeCode
	 */
	public String getParticpationTypeCode() {
		return particpationTypeCode;
	}


}
