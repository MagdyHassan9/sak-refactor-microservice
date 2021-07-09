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
@Table(name = "REF_CUST_CATS")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "CAT_ID"))})
public class RefCustCats extends DomainEntity<Integer> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6873224490677061740L;
	@Column(name = "CAT_CODE")
	private String catCode;
	@Column(name = "CAT_DESC")
	private String catDesc;
	@Column(name = "SORT_ORDER")
    private Long sortOrder;
}
