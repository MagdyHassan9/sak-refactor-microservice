package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class TabCustomersDto extends BaseDto<Integer> implements Serializable {
    private String customerName;

    private Long customerStatus;

    //fk
    private RefCustStatusDto refCustStatus;

    //fk
    private RefCustomerTypesDto refCustomerTypes;


    //fk
    private RefCustCatsDto refCustcats;


    //fk
    private RefNationalityTypesDto refNationalityTypes;

    //fk
    private RefCustomerIdTypesDto refCustomerIdTypes;

    private String customerCivilId;

    private String job;

    private String address;

    private Date birthDate;


    //fk
    private RefGovernmentsDto refGovernments;

    private Long fkTbookId;

    private String birthPlace;
    private String jobPlace;


    private Date insertDate;

    //fk
    private RefCustomerGenderDto refCustomerGender;


    //Foreignkey
    private RefCustomerReligiousDto refCustomerReligious;

    private Long mobileNo;

    private String motherName;
    private String tribeName;

    private Date idExpiryDate;

    private Long qualificationId;

    private Long professionId;

    private Long workStatusId;

    private Long governorateId;

    private String embassyDocNo;

    private Date embassyDocDate;

    private Date legalDate;
    private Date governorateDate;
    private Date passportIssueDate;

    private String customerNameEn;
    private String licenseNo;

    private Long isManualPassport;

    private Long graduationRelationId;

    private Long graduationReasonId;

    private String courtApprovalNo;

    private Date courtApprovalDate;

    private String courtName;

    private String widowingNo;

    private String widowingIssuePlace;
    private Date widowingDate;
    private List<TrxProcurationCustomersDto> tabCustomersList;


}
