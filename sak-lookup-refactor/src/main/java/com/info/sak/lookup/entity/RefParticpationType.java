package com.info.sak.lookup.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_PARTICPATION_TYPE")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "CUSTOMER_PARTICPANT_TYPE"))})

@Data
public class RefParticpationType extends DomainEntity<Integer> implements Serializable {
    @Column(name = "SORT_ORDER")
    private Long sortOrder;
    @Column(name = "CUSTOMER_FROM_TO_DESC")
    private String customerFormToDesc;
    @Column(name = "CUSTOMER_PARTICPANT_TYPE_CODE")
    private String customerParticpantTypeCode;
}
