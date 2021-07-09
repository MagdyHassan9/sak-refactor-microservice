package com.info.sak.lookup.entity.base;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class DomainEntity<T extends Serializable> /* implements DomainModel<T> */   {

    /**
     *
     */
    private static final long serialVersionUID = 3180248775696527473L;

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private T id;

}
