package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.List;

import com.info.sak.lookup.entity.LookupHtmlComponents;
import com.info.sak.lookup.entity.RefDebagaTemplate;
import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class RefDebagaTemplateDto  extends BaseDto<Integer> implements Serializable {
	private String code;

	private String description;
	private Long sortOrder;
	private String text;
	private String buttonGroup;
	private Long virtualGroup;
	//	@EqualsAndHashCode.Exclude
//	@ToString.Exclude
	private RefDebagaTemplate parentDebagaTemplate;
	//	@EqualsAndHashCode.Exclude
//	@ToString.Exclude
	private LookupHtmlComponents lookupHtmlComponents;
	private String classType;
	private String columnType;
	private Long maxVal;
	private Long minVal;
	private Long required;
	private String descriptionEn;
	private String textEn;
	private String textData;
	private Long expiredMonths;
	private Long cost;
	private Long statics;
	//	@EqualsAndHashCode.Exclude
//	@ToString.Exclude
	private List<RefDebagaTemplateDto> childDebagaTemplates;


}