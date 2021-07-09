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
@Table(name = "REF_ISSUE_CATEGORY")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ISSUE_TYPE_CATEGORY"))})
public class RefIssueCategory extends DomainEntity<Integer> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9075341948912268401L;
	@Column(name = "ISSUE_TYPE_CATEGORY_CODE")
	private String issueTypeCategoryCode;
	@Column(name = "ISSUE_CATEGORY_DESC")
	private String issueCategoryDesc;
	@Column(name = "SORT_ORDER")
    private Long sortOrder;
	@Column(name = "ISSUE_APPEAR_STATUS")
    private Long issueAppearStatus;
	@Column(name = "ISSUE_CATEGORY_DESC_EN")
	private String issueCategoryDescEn;
	

}
