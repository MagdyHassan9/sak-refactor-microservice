package com.info.sak.lookup.support.dto.base;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseDto<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 7122210533487785059L;

    private T id;

}
