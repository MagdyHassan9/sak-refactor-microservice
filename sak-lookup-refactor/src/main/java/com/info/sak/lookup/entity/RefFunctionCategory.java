package com.info.sak.lookup.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
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
@Table(name = "REF_FUNCTION_CATEGORY")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})
@Data
public class RefFunctionCategory extends BaseAuditingEntity<Integer> implements Serializable {

    @Column(name = "NAME_AR")
    private String nameAr;

    @Column(name = "NAME_EN")
    private String nameEn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_CATEGORY_ID")
    private RefFunctionCategory parentFunctionCategory;

    @OneToMany(mappedBy = "parentFunctionCategory", fetch = FetchType.EAGER)
    private List<RefFunctionCategory> children;


    @Column(name = "MODULE_ID")
    private Long moduleId;

    @Column(name = "ENABLED")
    private String enabled;

    @Column(name = "SORT_ORDER")
    private Long sortOrder;

    @Column(name = "CODE")
    private String code;

    @Column(name = "IMAGE_URL")
    private String imageUrl;

    @OneToMany(targetEntity = RefFunction.class, mappedBy = "functionCategory", fetch = FetchType.LAZY)
    private List<RefFunction> functionList;

}
