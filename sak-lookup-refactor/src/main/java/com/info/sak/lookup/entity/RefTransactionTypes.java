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
@Table(name = "REF_TRANSACTION_TYPES")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "TRANSACTION_TYPE_ID"))})
@Data
public class RefTransactionTypes extends DomainEntity<Integer> implements Serializable {
    @Column(name = "TRANSACTION_TYPE_CODE")
    private String typeCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRANSACTION_TYPE_CATEGORY")
    private RefTransactionCategory transactionCategory;

    @Column(name = "TRANSACTION_TYPE_DESC")
    private String typeDesk;

    @Column(name = "TRANSACTION_TYPE_FLAG")
    private Long typeFlag;


    @Column(name = "CUST_FROM")
    private Long custForm;

    @Column(name = "CUST_TO")
    private Long custTo;

    @Column(name = "CUST_WITT")
    private Long custWitt;

    @Column(name = "OLD_PROC")
    private Long oldProc;

    @Column(name = "SIGNS")
    private Long signs;

    @Column(name = "TEMPLETE")
    private Long templete;

    @Column(name = "SELLING")
    private Long selling;

    @Column(name = "ACKNOWLEDGMENT")
    private Long acknowledgment;

    @Column(name = "MANUAL_TRANS_FLAG")
    private Long manualTransFlag;

    @Column(name = "FLAG")
    private Long flag;

    @Column(name = "SORT_ORDER")
    private Long sortOrder;

    @Column(name = "IS_MULTI_DEBAGA")
    private Long isMultiDebaga;

    @Column(name = "TRANSACTION_TYPE_DESC_EN")
    private String descEn;

    @Column(name = "TRANSACTION_REPORT")
    private String report;

    @Column(name = "EXPIRATION_PERIOD")
    private Long expirationPeriod;

    @Column(name = "PERCENT_FIELD")
    private String percentField;

    @Column(name = "PERCENT")
    private Long percent;

    @Column(name = "SHOW_FIRST_CLASS_RELATION")
    private Long showFirstClassRelation;

    @Column(name = "SHOW_SECOND_CLASS_RELATION")
    private Long showSecondClassRelation;

    @Column(name = "SHOW_THIRD_CLASS_RELATION")
    private Long showThirdClassRelation;

    @Column(name = "SHOW_FOURTH_CLASS_RELATION")
    private Long showFourthClassRelation;

    @Column(name = "APPROVE_FIRST_PARTY")
    private Long approveFirstParty;

    @Column(name = "APPROVE_SECOND_PARTY")
    private Long approveSecondParty;

    @Column(name = "FIXED_FACTOR")
    private Long fixedFactor;

    @Column(name = "CAN_ISSUE_FROM_OSS")
    private Long canIssueFromOss;

    @Column(name = "EXPIRATION_PERIOD_COUNT")
    private Long expirationPeriodCount;

    @Column(name = "CAN_ISSUE_FROM_PORTAL")
    private Long canIssueFromPortal;

    @Column(name = "FIRST_PARTY_LABEL")
    private String firstPartyLabel;

    @Column(name = "SECOND_PARTY_LABEL")
    private String secondPartyLabel;

    @Column(name = "Third_PARTY_LABEL")
    private String thirdPartyLabel;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ISSUE_TYPE_CATEGORY")
    private RefTransactionCategory issueTypeCategory;

    @Column(name = "PRE_TEMPLATE_TEXT")
    private String preTemplateText;

    @Column(name = "POST_TEMPLATE_TEXT")
    private String postTemplateText;

    @Column(name = "DEBAGA_TYPE_CODE")
    private String debagaTypeCode;

    @Column(name = "WITNESS_LABEL_1")
    private String witnessLabel1;

    @Column(name = "WITNESS_LABEL_2")
    private String witnessLabel2;

    @Column(name = "PRE_FIRST_PARTIES_TEXT")
    private String preFirstPartiesText;

    @Column(name = "PRE_SECOND_PARTIES_TEXT")
    private String preSecondPartiesText;

    @Column(name = "PRE_WITNESS_PARTIES_TEXT")
    private String preWitnessPartiesText;


}
