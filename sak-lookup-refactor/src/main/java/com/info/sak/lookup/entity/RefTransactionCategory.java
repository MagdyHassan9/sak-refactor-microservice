package com.info.sak.lookup.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_TRANSACTION_CATEGORY")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "TRANSACTION_TYPE_CATEGORY"))})
@Data
public class RefTransactionCategory extends DomainEntity<Integer> implements Serializable {
    @Column(name = "TRANSACTION_TYPE_CATEGORY_CODE")
    private String categoryCode;
    @Column(name = "TRANSACTION_CATEGORY_DESC")
    private String categoryDesk;
    @Column(name = "TRANSACTION_APPEAR_STATUS")
    private Long appearStatus;
    @Column(name = "SORT_ORDER")
    private Long sortOrder;
    @JoinColumn(name = "PARENT_TYPE_CATEGORY")
    @ManyToOne(fetch = FetchType.LAZY)
    private RefTransactionCategory refTransactionCategory;
    @Column(name = "TRANSACTION_CATEGORY_DESC_EN")
    private String deskEn;
    @OneToMany( targetEntity = RefTransactionTypes.class,mappedBy = "issueTypeCategory")
    private List<RefTransactionCategory> IssueTypeCategoryList;
    @OneToMany(targetEntity = RefTransactionTypes.class,mappedBy = "transactionCategory")
    private List<RefTransactionCategory> transactionCategoryList;




}
