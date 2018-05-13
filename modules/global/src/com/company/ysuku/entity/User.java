package com.company.ysuku.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.company.ysuku.enumeration.GenderEnum;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import java.util.Date;
import java.util.List;

/**
 * create by Stefan on 5/12/18
 */
@NamePattern("%s|name")
@Table(name = "YSUKU_USER")
@Entity(name = "ysuku$User")
public class User extends StandardEntity {
    private static final long serialVersionUID = -3764140733970143258L;

    @NotNull(message = "{msg://User.name.notNull}")
    @Column(name = "NAME")
    protected String name;

    @NotNull(message = "{msg://User.password.notNull}")
    @Lob
    @Column(name = "PASSWORD")
    protected String password;

    @NotNull(message = "{msg://User.gender.notNull}")
    @Column(name = "GENDER")
    protected Integer gender;

    @Column(name = "MOBILE")
    protected String mobile;

    @Column(name = "EMAIL")
    protected String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "BIRTHDAY")
    protected Date birthday;

    @Lob
    @Column(name = "MEMO")
    protected String memo;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "user")
    protected List<Address> addressList;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "user")
    protected List<Order> orderList;

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public GenderEnum getGender() {
        return gender == null ? null : GenderEnum.fromId(gender);
    }

}