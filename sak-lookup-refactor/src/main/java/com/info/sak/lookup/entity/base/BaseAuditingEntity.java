package com.info.sak.lookup.entity.base;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Data
public abstract class BaseAuditingEntity<T extends Serializable> extends DomainEntity<T> implements Serializable {
    private static final long serialVersionUID = -4695298060982301459L;

    @Column(name = "CREATE_BY")
    private Long createBy;

    @Column(name = "CREATE_DATE")
    private Timestamp createDate;

    @Column(name = "UPDATE_BY")
    private Long updateBy;

    @Column(name = "UPDATE_DATE")
    private Timestamp updateDate;
}
