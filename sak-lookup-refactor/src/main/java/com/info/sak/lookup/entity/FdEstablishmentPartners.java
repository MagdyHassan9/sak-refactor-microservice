package com.info.sak.lookup.entity;

 
import lombok.Data;

import javax.persistence.*;

import com.info.sak.lookup.entity.base.DomainEntity;

@Entity
@Table(name = "FD_ESTABLISHMENT_PARTNERS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ESTABLISHMENT_PARTNER_ID"))})
@Data
public class FdEstablishmentPartners extends DomainEntity<Integer> {

    @Column(name = "COMMERCIAL_NAME")
    private String commercialName;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "COMMERCIAL_REGISTRATION_CODE")
    private String commercialRegistrationCode;

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
