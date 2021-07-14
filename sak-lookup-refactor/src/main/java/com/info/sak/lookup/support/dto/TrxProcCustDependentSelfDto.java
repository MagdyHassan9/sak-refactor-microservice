package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.Date;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class TrxProcCustDependentSelfDto extends BaseDto<Integer> implements Serializable {


    //fk
    private TrxProcCustDependentDto trxProcCustDependentClient;
    //fk
    private TrxProcCustDependentDto trxProcCustDependentAgent;
    //fk
    private TrxProcurationCustomersDto trxAgentProcurationCustomers;
    //fk
    private TrxProcurationCustomersDto trxMainProcurationCustomersSelf;
    private String accordingToDocument;
    private String accordingToDocumentIssuer;
    private Date accordingToDocumentDate;
    private Long backupFor;
}
