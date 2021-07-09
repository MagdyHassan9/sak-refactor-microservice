package com.info.sak.lookup.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.BaseAuditingEntity;

import lombok.Data;

@Entity
@Table(name = "REF_CUSTOMER_RELIGIOUS")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "RELIGIOUS_ID"))})
public class RefCustomerReligious extends BaseAuditingEntity<Integer> implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4920311098831291732L;
	@Column(name="RELIGIOUS_CODE")
	private String religiousCode;
	@Column(name="RELIGIOUS_DESC")
	private String religiousDesc;
	@Column(name="GENDER")
	private Long gender;
	@Column(name="SORT_ORDER")
	private Long sortOrder;
}
