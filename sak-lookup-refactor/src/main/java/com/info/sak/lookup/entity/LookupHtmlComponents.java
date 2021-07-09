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
@Table(name = "LKUP_HTML_COMPONENTS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "HTML_COMPONENT_ID"))})
@Data
public class LookupHtmlComponents extends DomainEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -3592013473112123112L;

    @Column(name = "HTML_COMPONENT_CODE")
    private String htmlComponentCode;

    @Column(name = "SORT_ORDER")
    private Long sortOrder;
 /*
    @JsonIgnore

    @EqualsAndHashCode.Exclude

    @ToString.Exclude

    @OneToMany(targetEntity = RefDebagaTemplate.class, mappedBy = "lookupHtmlComponents")
    private List<RefDebagaTemplate> refDebagaTemplateList;
*/


}
