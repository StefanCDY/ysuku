package com.company.ysuku.enumeration;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

/**
 * create by Stefan on 5/12/18
 */
public enum GenderEnum implements EnumClass<Integer> {

    MALE(10),
    FEMALE(20);

    private Integer id;

    GenderEnum(Integer value) {
        this.id = value;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Nullable
    public static GenderEnum fromId(Integer id) {
        for (GenderEnum at : GenderEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}