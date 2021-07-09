package com.info.sak.lookup.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;


@Entity
@Table(name = "REF_PROC_STATUS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "STATUS_ID"))})
@Data
public class RefProcStatus extends DomainEntity<Integer> {

    @Column(name = "STATUS_CODE")
    private String statusCode;
    @Column(name = "STATUS_DESC")
    private String statusDesc;
    @Column(name = "SORT_ORDER")
    private Long sortOrder;

}
