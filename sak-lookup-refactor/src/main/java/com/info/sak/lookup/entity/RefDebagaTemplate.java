package com.info.sak.lookup.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "REF_DEBAGA_TEMPLATE")
@Data

public class RefDebagaTemplate extends DomainEntity<Integer> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7294630925070032361L;

	@Column(name = "DEBAGA_CODE")
	private String code;

	@Column(name = "TEXT_DESC")
	private String description;
	@Column(name = "SORT_ORDER")
	private Long sortOrder;


	@Column(name = "TEXT")
	private String text;

	@Column(name = "BUTTON_GROUP")
	private String buttonGroup;

	@Column(name = "VIRTUAL_GROUP")
	private Long virtualGroup;
 
	@Transient
	private RefDebagaTemplate parentDebagaTemplate;

	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToOne
	@JoinColumn(name = "HTML_COMPONENT_ID")
	LookupHtmlComponents lookupHtmlComponents;


	@Column(name = "CLASS")
	private String classType;


	@Column(name = "COLUMN_TYPE")
	private String columnType;


	@Column(name = "MAX_Val")
    private Long maxVal;
	
	@Column(name = "MIN_Val")
    private Long minVal;
	
	@Column(name = "REQUIRED")
    private Long required;

	@Column(name = "TEXT_DESC_EN")
	private String descriptionEn;

	@Column(name = "TEXT_EN")
	private String textEn;
	@Column(name = "TEXT_DATA")
	private String textData;

	@Column(name = "EXPIRED_MONTHS")
	private Long expiredMonths;

	@Column(name = "COST")
	private Long cost;

	@Column(name = "STATIC")
	private Long statics;

 	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "PARENT_ID")
	private List<RefDebagaTemplate> childDebagaTemplates;
 


 
	
}
