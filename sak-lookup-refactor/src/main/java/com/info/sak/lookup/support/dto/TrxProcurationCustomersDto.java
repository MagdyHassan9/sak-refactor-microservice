package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class TrxProcurationCustomersDto extends BaseDto<Integer> implements Serializable {

    private Byte customerNo;

    private Boolean status;

    private Boolean requsterFlag;

    private Boolean fIslawyer;

    private Boolean ffdFlag;

    private Boolean signFlag;

    private String signNotes;

    private Boolean fPCustDeliver;

    private Boolean hasPartenerRep;

    private Timestamp insertDate;

    private String notes;

    private Boolean isApproved;

    private String delegateList;

    private String delegateList1;

    private Long procurationCstParentSerial;

    private Long procCstParentProcno;

    private Long procCstParentProcyear;

    private Long commisionerId;

    private String relativeRelation;

    private Boolean isKhatmApproved;
    private Time khatmDate;

    private String khatmUserName;

    private String khatmUserId;

    private String khatmUserOid;

    private String khatmCardSerialNumber;

    private String khatmMachineIp;

    private Long requestSerial;


    private Long procurationSerial;

    private Long facilityDataId;


    ///fk
    private TabCustomersDto tabCustomers;

    //fk
    private RefRequestCustTypesDto refRequestCustTypes; 
    
    //fk
    private RefCustomerTypesDto refCustomerTypes;
 

    //fk
    private List<TrxProcCustDependentSelfDto> trxProcCustDependentSelftList;

    //fk
    private List<TrxProcCustDependentSelfDto> trxAgentProcurationCustomersList;

    //fk
    private List<TrxProcCustDependentDto> trxMainProcurationCustomersList;

    //fk
    private List<TrxProcCustDependentDto> trxProcurationCustomersList;

    //fk
    private FacilityDataDto facilityData;

}
