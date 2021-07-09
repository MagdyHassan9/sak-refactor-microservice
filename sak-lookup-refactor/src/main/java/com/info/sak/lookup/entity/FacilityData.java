package com.info.sak.lookup.entity;
 
import lombok.Data;

import javax.persistence.*;

import com.info.sak.lookup.entity.base.DomainEntity;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "FACILITY_DATA")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})
@Data
public class FacilityData extends DomainEntity<Integer> {

    @Column(name = "COMMERCIAL_REGISTER")
    public String commercialRegister;

    @Column(name = "FACILITY_NO")
    public String facilityNo;

    @Column(name = "FACILITY_NAME")
    public String facilityName;

    @Column(name = "POSTAL_BOX")
    public String postalBox;

    @Column(name = "TEL")
    public String tel;

    @Column(name = "EXPIRY_DATE")
    public Timestamp expiryDate;

    @Column(name = "PERCENTAGE")
    public String percentage;

    @Column(name = "BRANCH_NUMBER")
    public String branchNumber;

    @OneToMany(targetEntity = FdBranches.class, mappedBy = "facilityData", fetch = FetchType.LAZY)
    private List<FdBranches> branchesList;

    @OneToMany(targetEntity = FdEstablishmentPartners.class, mappedBy = "facilityData", fetch = FetchType.LAZY)
    private List<FdEstablishmentPartners> establishmentPartnersList;

    @OneToMany(targetEntity = FdHumanPartners.class, mappedBy = "facilityData", fetch = FetchType.LAZY)
    private List<FdHumanPartners> humanPartnersList;

    @OneToMany(targetEntity = FdSignatories.class, mappedBy = "facilityData", fetch = FetchType.LAZY)
    private List<FdSignatories> signatoriesList;

}
