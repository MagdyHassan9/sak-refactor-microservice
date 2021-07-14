/**
 * 
 */
package com.info.sak.lookup.constant;

import org.apache.commons.lang3.StringUtils;

/**
 * @author mohatiea
 * @created Jul 8, 2015 - 12:30:31 PM
 */
public enum SakAccessRoleEnum {
	INTERNAL("INTERNAL"), EXTERNAL("EXTERNAL"), EMPLOYEE("EMPLOYEE"), MINISTRY("MINISTRY");
	
	private String roleCode;
	
	SakAccessRoleEnum(String roleCode)
	{
		this.roleCode = roleCode;
	}

	public static SakAccessRoleEnum getByRoleCode(String roleCode)
	{
		if(StringUtils.isNoneBlank(roleCode))
		{
			for(SakAccessRoleEnum sakAccessRoleEnum : SakAccessRoleEnum.values())
			{
				if(roleCode.equals(sakAccessRoleEnum.getRoleCode()))
				{
					return sakAccessRoleEnum;
				}
			}
		}
		return null;
	}
	
	/**
	 * @return the roleCode
	 */
	public String getRoleCode() {
		return roleCode;
	}
}
