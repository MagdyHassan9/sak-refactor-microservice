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
@Table(name = "REF_REQUEST_SOURCE")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "REQUEST_SOURCE_ID"))})
@Data
public class RefRequestSource extends DomainEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -2494391062244646132L;

    @Column(name = "REQUEST_SOURCE_DESC")
    private String requestSourceDesc;

}
