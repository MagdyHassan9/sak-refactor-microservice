package com.info.sak.lookup.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_TRANSACTION_CUST_TYPES")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "TRANSACTION_TYPE_ID"))})
@Data
public class RefTransactionCustTypes extends DomainEntity<Integer> {

    @Column(name = "TRANSACTION_ID")
    private Long transactionId;
    @Column(name = "CUST_TYPE_ID")
    private Long custTypeId;
    @Column(name = "APPROVE_SECOND_PARTY")
    private Boolean approveSecondParty;
    @Column(name = "PARTY_ID")
    private Long partyId;
    @Column(name = "APPROVE_FIRST_PARTY")
    private Boolean approveFirstParty;
    @Column(name = "SHOW_FIRST_CLASS_RELATION")
    private Boolean showFirstClassRelation;
    @Column(name = "EXPIRATION_PERIOD")
    private Long expirationPeriod;
    @Column(name = "PERCENT_FIELD")
    private Boolean percentField;
    @Column(name = "PERCENT")
    private Long percent;
    @Column(name = "SHOW_SECOND_CLASS_RELATION")
    private Boolean showSecondClassRelation;
    @Column(name = "SHOW_THIRD_CLASS_RELATION")
    private Boolean showThirdClassRelation;
    @Column(name = "SHOW_FOURTH_CLASS_RELATION")
    private Boolean showFourthClassRelation;

}
