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
@Table(name = "REF_NATIONALITY_TYPES_TABLE")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "NATIONALITY_TYPE_NO"))})
@Data
public class RefNationalityTypesTable extends DomainEntity<Integer> implements Serializable {

    @Column(name = "NATIONALITY_TYPE_CODE")
    private String nationalityTypeCode;
    @Column(name = "NATIONALITY_TYPE_DESC")
    private String nationalityTypeDesc;
    @Column(name = "GENDER")
    private long gender;
    @Column(name = "SORT_ORDER")
    private long sortOrder;
    @Column(name = "INTEGRATION_ID")
    private long integrationId;
    @Column(name = "NATIONALITY_MALE")
    private String nationalityMale;
    @Column(name = "NATIONALITY_FEMALE")
    private String nationalityFeMale;
    @Column(name = "NATIONALITY_TYPE_DESC_EN")
    private String nationalityTypeDescEn;
    @Column(name = "STATUS")
    private long status;

}
