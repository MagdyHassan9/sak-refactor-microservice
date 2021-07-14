package com.info.sak.lookup.support.dto;


import java.io.Serializable;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;
@Data
public class RefTransactionTypesDto extends BaseDto<Integer> implements Serializable {
    private String typeCode;
    private RefTransactionCategoryDto transactionCategory;
    private String typeDesk;
    private Long typeFlag;
    private Long custForm;
    private Long custTo;
    private Long custWitt;
    private Long oldProc;
    private Long signs;
    private Long templete;
    private Long selling;
    private Long acknowledgment;
    private Long manualTransFlag;
    private Long flag;
    private Long sortOrder;
    private Long isMultiDebaga;
    private String descEn;
    private String report;
    private Long expirationPeriod;
    private String percentField;
    private Long percent;
    private Long showFirstClassRelation;
    private Long showSecondClassRelation;
    private Long showThirdClassRelation;
    private Long showFourthClassRelation;
    private Long approveFirstParty;
    private Long approveSecondParty;
    private Long fixedFactor;
    private Long canIssueFromOss;
    private Long expirationPeriodCount;
    private Long canIssueFromPortal;
    private String firstPartyLabel;
    private String secondPartyLabel;
    private String thirdPartyLabel;
    private RefTransactionCategoryDto issueTypeCategory;
    private String preTemplateText;
    private String postTemplateText;
    private String debagaTypeCode;
    private String witnessLabel1;
    private String witnessLabel2;
    private String preFirstPartiesText;
    private String preSecondPartiesText;
    private String preWitnessPartiesText;





















}
