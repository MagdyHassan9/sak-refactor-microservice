package com.info.sak.lookup.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.info.sak.lookup.entity.base.BaseAuditingEntity;

import lombok.Data;


@Entity
@Table(name = "REF_FUNCTION")
@Data
public class RefFunction extends BaseAuditingEntity<Integer> {

    @Column(name = "CODE")
    private String code;
    //
    @Column(name = "NAME_AR")
    private String nameAr;

    @Column(name = "NAME_EN")
    private String nameEn;
    //
    @Column(name = "FUNCTION_TYPE")
    private String functionType;

    @Column(name = "USE_EMAIL")
    private Boolean useEmail;

    @Column(name = "USE_SMS")
    private Boolean useSms;

    @Column(name = "FUNCTION_URL")
    private String functionUrl;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @Column(name = "ENABLED")
    private Boolean enabled;

    @Column(name = "SORT_ORDER")
    private Long sortOrder;

    @ManyToOne
    @JoinColumn(name = "FUNCTION_CATEGORY_ID")
    private RefFunctionCategory functionCategory;

    @OneToMany(targetEntity = RefResourcesFunction.class, mappedBy = "function", fetch = FetchType.LAZY)
    private List<RefResourcesFunction> resourcesList;


//
//
//    @Column(name = "ADDED_BY")
//    private Long addedBy;
//
//    @Column(name = "ADD_DATE")
//    private Timestamp addDate;
//
//    @Column(name = "UPDATED_BY")
//    private Long updatedBy;
//
//    @Column(name = "LAST_UPDATE")
//    private Timestamp lastUpdate;


//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "function", targetEntity = SakFunctionParameters.class)
//    private List<SakFunctionParameters> functionParametersList;
}
