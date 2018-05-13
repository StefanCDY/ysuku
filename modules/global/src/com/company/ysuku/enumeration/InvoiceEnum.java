package com.company.ysuku.enumeration;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;

/**
 * create by Stefan on 5/12/18
 */
public enum InvoiceEnum implements EnumClass<Integer> {

    NONE(10),
    PAPER_INVOICE(20),
    ELECTRONIC_INVOICE(30);

    private Integer id;

    InvoiceEnum(Integer value) {
        this.id = value;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Nullable
    public static InvoiceEnum fromId(Integer id) {
        for (InvoiceEnum at : InvoiceEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}