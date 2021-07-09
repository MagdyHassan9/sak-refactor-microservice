package com.info.sak.lookup.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_PAY_TYPES")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "PAY_TYPE_ID"))})
@Data
public class RefPayTypes extends DomainEntity<Integer> {

    @Column(name = "PAY_TYPE_CODE")
    private String payTypeCode;
    @Column(name = "PAY_TYPE_DESC")
    private String payTypeDesc;

}
