package com.info.sak.lookup.entity;

import com.info.sak.lookup.entity.base.DomainEntity;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LKUP_REQUEST_STATUS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})
@Data
public class LookupRequestStatus extends DomainEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -3832780886950078624L;

    @Column(name = "CODE")
    private String code;

    @Column(name = "SORT_ORDER")
    private Byte sortOrder;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DESCRIPTION_EN")
    private String descriptionEn;

}
