package com.company.ysuku.enumeration;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

/**
 * create by Stefan on 5/12/18
 */
public enum PayTypeEnum implements EnumClass<Integer> {

    CASH(10),
    WECHAT(20),
    ALIPAY(30),
    CARD(40);

    private Integer id;

    PayTypeEnum(Integer value) {
        this.id = value;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Nullable
    public static PayTypeEnum fromId(Integer id) {
        for (PayTypeEnum at : PayTypeEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}