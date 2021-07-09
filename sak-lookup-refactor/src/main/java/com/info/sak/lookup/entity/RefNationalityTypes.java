package com.info.sak.lookup.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_NATIONALITY_TYPES")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "REF_NATIONALITY_TYPES"))})
public class RefNationalityTypes extends DomainEntity<Integer> implements Serializable{
	@Column(name = "NATIONALITY_TYPE_NO")
	private Long nationalityTypeNo;
	@Column(name = "NATIONALITY_TYPE_CODE")
	private String nationalityTypeCode;
	@Column(name = "NATIONALITY_TYPE_DESC")
	private String nationalityTypeDesc;
	
	@Column(name = "GENDER")
	private Long gender;
	
	@Column(name = "SORT_ORDER")
    private Long sortOrder;
	
	@Column(name = "INTEGRATION_ID")
    private Long integrationId;
	
	@Column(name = "STATUS")
    private Long status;
	
	@Column(name = "NATIONALITY_TYPE_DESC_EN")
	private String nationalityTypeDescEn;
	
	@Column(name = "NATIONALITY_FEMALE")
	private String nationalityFemale;
	
	@Column(name = "NATIONALITY_MALE")
	private String nationalityMale;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
