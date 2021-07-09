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
@Table(name = "REF_CUSTOMER_ID_TYPES")
@Data
@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "CUSTOMER_ID_TYPE"))})
public class RefCustomerIdTypes extends DomainEntity<Integer> implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6655635024740567685L;
	
	@Column(name = "CUSTOMER_ID_TYPE_CODE")
    private String CustomerIdTypeCode;
	
    @Column(name = "CUSTOMER_ID_TYPE_DESC")
    private String CustomerIdTypeDesc;
    
    @Column(name = "SORT_ORDER")
    private Long sortOrder;
    
    @Column(name = "IS_FIRST_PROCURATION")
    private Long isFirstProcuration;
    
    @Column(name = "CUSTOMER_ID_TYPE_DESC_EN")
    private String CustomerIdTypeDescEn;

    @Column(name = "MIN_VALUE")
    private Integer minValue;

    @Column(name = "MAX_VALUE")
    private Integer maxValue;

    @Column(name = "ACCEPTANCE_VALUE")
    private String acceptanceValue;
 
}
