package com.info.sak.lookup.support.dto;

import javax.persistence.Column;

import com.info.sak.lookup.entity.base.DomainEntity;

public class TbProcurationsDto extends DomainEntity<Integer> {

    @Column(name = "REP_PROCURATION_SERIAL")
    private String repProcurationSerial;

    @Column(name = "REP_PROCURATION_YEAR")
    private Long repProcurationYear;

    @Column(name = "PROCURATION_TYPE")
    private Boolean procurationType;

    @Column(name = "REP_NAME")
    private String repName;

    @Column(name = "PROCURATION_NOTE")
    private String procurationNote;

    @Column(name = "REP_ORGANIZATION_UNIT_ID")
    private Byte repOrganizationUnitId;

    @Column(name = "PROCURATION_AUTO")
    private Boolean procurationAuto;

    @Column(name = "ISSUER")
    private String issuer;

    @Column(name = "FINAL_REQUEST_ID")
    private Long finalRequestId;

    @Column(name = "PARENT_PROCURATION_SERIAL")
    private Long parentProcurationSerial;

}
