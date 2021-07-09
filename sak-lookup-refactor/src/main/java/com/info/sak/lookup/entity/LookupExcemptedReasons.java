package com.info.sak.lookup.entity; 

import lombok.Data;

import javax.persistence.*;

import com.info.sak.lookup.entity.base.DomainEntity;

import java.io.Serializable;

@Entity
@Table(name = "LKUP_EXCEMPTED_REASONS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "REASON_ID"))})
@Data
public class LookupExcemptedReasons extends DomainEntity<Integer> implements Serializable {
    private static final long serialVersionUID = -3207171219217245401L;

    @Column(name = "REASON_CODE")
    private String reasonCode;

    @Column(name = "REASON_DESC")
    private String reasonDesc;

    @Column(name = "SORT_ORDER")
    private Short sortOrder;

}
