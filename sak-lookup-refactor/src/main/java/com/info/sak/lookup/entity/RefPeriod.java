package com.info.sak.lookup.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;


@Entity
@Table(name = "REF_PERIOD")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})
@Data
public class RefPeriod extends DomainEntity<Integer> {

    @Column(name = "PERIOD_TYPE_ID")
    private Long periodTypeId;

    @Column(name = "PERIOD_TYPE_VALUE")
    private Long periodTypeValue;

}
