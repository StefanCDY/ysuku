package com.company.ysuku.enumeration;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

/**
 * create by Stefan on 5/12/18
 */
public enum TypeEnum implements EnumClass<Integer> {

    PRODUCT(10),
    GIFT(20);

    private Integer id;

    TypeEnum(Integer value) {
        this.id = value;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Nullable
    public static TypeEnum fromId(Integer id) {
        for (TypeEnum at : TypeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}