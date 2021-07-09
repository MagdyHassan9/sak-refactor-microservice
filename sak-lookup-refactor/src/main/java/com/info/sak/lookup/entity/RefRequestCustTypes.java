package com.info.sak.lookup.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_REQUEST_CUST_TYPES")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "CUST_TYPE_ID"))})

public class RefRequestCustTypes extends DomainEntity<Integer> implements Serializable {
    @Column(name = "CUST_TYPE_CODE")
    private String custTypeCode;
    @Column(name = "CUST_TYPE_DESC")
    private String custTypeDesc;
    @Column(name = "SORT_ORDER")
    private Long sortOrder;
    @Column(name = "CUST_TYPE_DESC_EN")
    private String custTypeDescEn;

    @OneToMany(targetEntity = RefReqCustTypeCat.class, mappedBy = "refRequestCustTypes")
    private List<RefReqCustTypeCat> refReqCustTypeCatList;


}
