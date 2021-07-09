package com.info.sak.lookup.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.DomainEntity;

import lombok.Data;

@Entity
@Table(name = "REF_RESOURCES_FUNCTION")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})

@Data
public class RefResourcesFunction extends DomainEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -7350272808756646469L;

    @Column(name = "RESOURCES_NAME_AR")
    private String resourcesNameAr;

    @Column(name = "RESOURCES_NAME_EN")
    private String resourcesNameEn;

    @Column(name = "RESOURCES_CODE")
    private String resourcesCode;

    @ManyToOne
    @JoinColumn(name = "REF_FUNCTION_ID")
    private RefFunction function;

}
