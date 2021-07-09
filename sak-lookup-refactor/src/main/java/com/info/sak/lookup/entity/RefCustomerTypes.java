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
@Table(name = "REF_CUSTOMER_TYPES")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "CUSTOMER_TYPE_NO"))})
public class RefCustomerTypes extends DomainEntity<Integer> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5265275924823028270L;
	@Column(name = "CUSTOMER_TYPE_CODE")
	private String customerTypeCode;
	@Column(name = "CUSTOMER_TYPE_DESC")
	private String customerTypeDesc;
	@Column(name = "SORT_ORDER")
    private Long sortOrder;
}
