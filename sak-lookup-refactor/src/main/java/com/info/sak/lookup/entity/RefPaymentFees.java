package com.info.sak.lookup.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_PAYMENT_FEES")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "PAYMENT_ID"))})
@Data
public class RefPaymentFees extends DomainEntity<Integer> {

    @Column(name = "TRANSACTION_TYPE_ID")
    private Short transactionTypeId;
    @Column(name = "OSS")
    private Boolean oss;
    @Column(name = "FEES")
    private Long fees;
    @Column(name = "SORT_ORDER")
    private Short sortOrder;
    @Column(name = "FOR_FIRST_PARTY")
    private Boolean forFirstParty;
    @Column(name = "FOR_SECOND_PARTY")
    private Boolean forSecondParty;
    @Column(name = "FEES1")
    private Long fees1;
    @Column(name = "FEES2")
    private Long fees2;
    @Column(name = "FEES3")
    private Long fees3;
    @Column(name = "FEES4")
    private Long fees4;

}
