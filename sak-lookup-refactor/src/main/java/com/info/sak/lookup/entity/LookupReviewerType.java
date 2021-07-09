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
@Table(name = "LKUP_REVIEWER_TYPE")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})
@Data
public class LookupReviewerType extends DomainEntity<Integer> implements Serializable {

    private static final long serialVersionUID = 1483042014637081569L;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;

    @Column(name = "SORT_ORDER")
    private Long sortOrder;


}
