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
@Table(name = "REF_CUSTOMER_GENDER")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "GENDER_ID"))})
public class RefCustomerGender extends DomainEntity<Integer> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5455658855044084176L;
	@Column(name = "GENDER_CODE")
	private String genderCode;
	@Column(name = "GENDER_DESC")
	private String genderDesc;
	@Column(name = "SORT_ORDER")
    private Long sortOrder;

}
