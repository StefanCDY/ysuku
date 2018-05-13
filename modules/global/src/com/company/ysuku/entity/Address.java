package com.company.ysuku.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.chile.core.annotations.NamePattern;

/**
 * create by Stefan on 5/12/18
 */
@NamePattern("%s %s %s|province,city,address")
@Table(name = "YSUKU_ADDRESS")
@Entity(name = "ysuku$Address")
public class Address extends StandardEntity {
    private static final long serialVersionUID = 7389253349591226714L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @NotNull(message = "{msg://Address.user.notNull}")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @NotNull(message = "{msg://Address.receiver.notNull}")
    @Column(name = "RECEIVER")
    protected String receiver;

    @Column(name = "PROVINCE")
    protected String province;

    @Column(name = "CITY")
    protected String city;

    @NotNull(message = "{msg://Address.address.notNull}")
    @Column(name = "ADDRESS")
    protected String address;

    @Lob
    @Column(name = "MEMO")
    protected String memo;

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

}