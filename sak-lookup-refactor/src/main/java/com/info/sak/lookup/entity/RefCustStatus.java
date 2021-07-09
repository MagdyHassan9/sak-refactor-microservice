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
@Table(name = "REF_CUST_STATUS")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "STATUS_ID"))})
public class RefCustStatus extends DomainEntity<Integer> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3155233133597153273L;
	@Column(name = "STATUS_CODE")
	private String statusCode;
	@Column(name = "STATUS")
	private String status;
	@Column(name = "SORT_ORDER")
    private Long sortOrder;
}