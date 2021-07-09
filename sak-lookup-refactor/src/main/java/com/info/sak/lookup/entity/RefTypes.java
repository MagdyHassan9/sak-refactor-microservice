package com.info.sak.lookup.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_TYPES")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "TRANSACTION_TYPE_ID"))})
@Data
public class RefTypes extends DomainEntity<Integer> {
    @Column(name = "TRANSACTION_TYPE_CODE")
    private String transactionTypeCode;
    @Column(name = "TRANSACTION_TYPE_CATEGORY")
    private Byte transactionTypeCategory;
    @Column(name = "TRANSACTION_TYPE_DESC")
    private String transactionTypeDesc;
    @Column(name = "TRANSACTION_TYPE_FLAG")
    private Boolean transactionTypeFlag;
    @Column(name = "CUST_FROM")
    private Boolean custFrom;
    @Column(name = "CUST_TO")
    private Boolean custTo;
    @Column(name = "CUST_WITT")
    private Boolean custWitt;
    @Column(name = "OLD_PROC")
    private Boolean oldProc;
    @Column(name = "SIGNS")
    private Boolean signs;
    @Column(name = "TEMPLETE")
    private Boolean templete;
    @Column(name = "SELLING")
    private Boolean selling;
    @Column(name = "ACKNOWLEDGMENT")
    private Boolean acknowledgment;
    @Column(name = "MANUAL_TRANS_FLAG")
    private Boolean manualTransFlag;
    @Column(name = "FLAG")
    private Boolean flag;
    @Column(name = "SORT_ORDER")
    private Short sortOrder;
    @Column(name = "IS_MULTI_DEBAGA")
    private Boolean isMultiDebaga;
    @Column(name = "TRANSACTION_TYPE_DESC_EN")
    private String transactionTypeDescEn;
    @Column(name = "TRANSACTION_REPORT")
    private String transactionReport;

}
