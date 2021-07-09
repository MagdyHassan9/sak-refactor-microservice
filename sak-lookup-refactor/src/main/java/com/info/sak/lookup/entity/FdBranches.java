package com.info.sak.lookup.entity;

 import lombok.Data;

import javax.persistence.*;

import com.info.sak.lookup.entity.base.DomainEntity;

@Entity
@Table(name = "FD_BRANCHES")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "BRANCHES_ID"))})
@Data
public class FdBranches extends DomainEntity<Integer> {

    @Column(name = "BRANCHE_NAME")
    private String branchName;

    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;

    @Column(name = "STATUS_CODE")
    private String statusCode;

    @Column(name = "STATUS_DESC")
    private String statusDesc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FACILITY_DATA_ID")
    private FacilityData facilityData;
}
