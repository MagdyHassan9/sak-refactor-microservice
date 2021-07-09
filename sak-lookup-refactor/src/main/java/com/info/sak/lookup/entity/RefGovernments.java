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
@Table(name = "REF_GOVERNMETS")
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "GOVERNMENTAL_ID"))})

@Data
public class RefGovernments extends DomainEntity<Integer> implements Serializable {

	   @Column(name = "SORT_ORDER")
	    private Long sortOrder;
	   @Column(name = "GOVERNMENTAL_CODE")
	    private String governmentalCode;
	   @Column(name = "SORT_DESC")
	    private Long sortDesc;
	   

}
