package com.info.sak.lookup.support.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.info.sak.lookup.support.dto.base.BaseDto;

import lombok.Data;

@Data
public class TabRequestsDto extends BaseDto<Integer> implements Serializable {
    private Date requestDate;

    private Long requestStatus;

    private Long organizationUnitId;

    private Long requestNo;

    private Long transactionTypeCode;

    private Date requestFinishDate;

    private Date requestNotes;

    private Long createByUserId;

    private Long ffdFlag;

    private String employeeNotes;

    private Long userIdApprove;

    private Long authUserId;

    private Long portal;

    private Long approvalEmployee;

    private Date approvalAssignedDate;

    private Date bookingDate;

    private Long receiptNo;

    private String authNo;

    private String cardNo;

    private String cardName;

    private String terminalId;

    private String transactionsSequenceNo;

    private Long totalAmount;

    private Long excemptedFees;

    private Long excemptedReasonId;

    private String excemptedReason;

    private Long requestSubType;

    private Date paymentDate;

    private String requestDateHijry;

    private List<TabRequestsVsDebagaDto> tabRequestsVsDebagaList;
}
