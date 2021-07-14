package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class TrxProcCustDependentDto extends BaseDto<Integer> implements Serializable {

    private String dependentId;

    private Long nationalityId;
    //fk
    private RefRequestCustTypesDto refRequestCustTypes;

    //fk
    private RefCustomerIdTypesDto refCustomerIdTypes;
    //fk
    private RefCustomerTypesDto refCustomerTypes;


    //fk
    private TrxProcurationCustomersDto trxMainProcurationCustomers;

    //fk
    private TrxProcurationCustomersDto trxProcurationCustomers;

    private Date dependentIdExpiryDate;

    private String dependentName;

    private Long backupFor;

    private String percentage;


    //fk
    private List<TrxProcCustDependentSelfDto> trxProcCustDependentSelfClientList;
    //fk
    private List<TrxProcCustDependentSelfDto> trxProcCustDependentSelfAgenttList;
}
