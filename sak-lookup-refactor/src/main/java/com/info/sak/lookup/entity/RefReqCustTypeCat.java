package com.info.sak.lookup.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;
@Entity
@Table(name = "REF_REQ_CUST_TYPE_CAT")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "CUST_TYPE_ID"))})

public class RefReqCustTypeCat extends DomainEntity<Integer> implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CUST_TYPE_CODE")
    private RefRequestCustTypes refRequestCustTypes;
    @Column(name = "TRANSACTION_TYPE_CODE")
    private Long transactionTypeCode;
    @Column(name = "SORT_ORDER")
    private Long sortOrder;
}
