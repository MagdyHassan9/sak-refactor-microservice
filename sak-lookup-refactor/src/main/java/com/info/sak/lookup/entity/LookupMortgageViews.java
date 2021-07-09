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
@Table(name = "LKUP_MORTGAGE_VIEWS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID"))})
@Data
public class LookupMortgageViews extends DomainEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -6650180554205586697L;

    @Column(name = "TRANSACTION_TYPE_ID")
    private Long transactionTypeId;
    @Column(name = "VIEW_NAME")
    private String viewName;
    @Column(name = "KEY")
    private String key;
    @Column(name = "DEBAGA_ID")
    private Long debagaId;
    @Column(name = "SALE_DEBAGA_ID")
    private Long saleDebagaId;
    @Column(name = "SALE_TRANSACTION_TYPE_ID")
    private Long saleTransactionTypeId;


}
