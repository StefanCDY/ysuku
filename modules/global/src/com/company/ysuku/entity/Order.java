package com.company.ysuku.entity;

import javax.persistence.*;

import com.company.ysuku.enumeration.InvoiceEnum;
import com.company.ysuku.enumeration.PayTypeEnum;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.validation.constraints.NotNull;

/**
 * create by Stefan on 5/12/18
 */
@NamePattern("%s|code")
@Table(name = "YSUKU_ORDER")
@Entity(name = "ysuku$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = -4269283382682599771L;

    @NotNull(message = "{msg://Order.code.notNull}")
    @Column(name = "CODE")
    protected String code;

    @NotNull(message = "{msg://Order.user.notNull}")
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @NotNull(message = "{msg://Order.address.notNull}")
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADDRESS_ID")
    protected Address address;

    @NotNull(message = "{msg://Order.payType.notNull}")
    @Column(name = "PAY_TYPE")
    protected Integer payType;

    @NotNull(message = "{msg://Order.invoiceType.notNull}")
    @Column(name = "INVOICE_TYPE")
    protected Integer invoiceType;

    @Lob
    @Column(name = "MEMO")
    protected String memo;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "order")
    protected List<OrderDetail> detailList;

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


    public void setDetailList(List<OrderDetail> detailList) {
        this.detailList = detailList;
    }

    public List<OrderDetail> getDetailList() {
        return detailList;
    }

    public void setPayType(PayTypeEnum payType) {
        this.payType = payType == null ? null : payType.getId();
    }

    public PayTypeEnum getPayType() {
        return payType == null ? null : PayTypeEnum.fromId(payType);
    }

    public void setInvoiceType(InvoiceEnum invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.getId();
    }

    public InvoiceEnum getInvoiceType() {
        return invoiceType == null ? null : InvoiceEnum.fromId(invoiceType);
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

}