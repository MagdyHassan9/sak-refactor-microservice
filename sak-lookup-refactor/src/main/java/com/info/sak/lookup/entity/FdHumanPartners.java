package com.info.sak.lookup.entity;
 
import lombok.Data;

import javax.persistence.*;

import com.info.sak.lookup.entity.base.DomainEntity;

@Entity
@Table(name = "FD_HUMAN_PARTNERS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "HUMAN_PARTNER_ID"))})
@Data
public class FdHumanPartners extends DomainEntity<Integer> {

    @Column(name = "HUMAN_NAME")
    private String humanName;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "N_IN")
    private String nIn;

    @Column(name = "N_IN_TYPE_CODE")
    private String nInTypeCode;

    @Column(name = "N_IN_TYPE_DESC")
    private String nInTypeDesc;

    @Column(name = "PERCENTAGE")
    private Long percentage;

    @Column(name = "PARTNER_TYPE_CODE")
    private String partnerTypeCode;

    @Column(name = "PARTNER_TYPE_DESC")
    private String partnerTypeDesc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FACILITY_DATA_ID")
    private FacilityData facilityData;

}
