package com.company.ysuku.entity;

import javax.persistence.*;

import com.haulmont.cuba.core.entity.StandardEntity;

import com.company.ysuku.enumeration.TypeEnum;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * create by Stefan on 5/12/18
 */
@Table(name = "YSUKU_ORDER_DETAIL")
@Entity(name = "ysuku$OrderDetail")
public class OrderDetail extends StandardEntity {
    private static final long serialVersionUID = 6037231653415759511L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    protected Order order;

    @NotNull(message = "{msg://OrderDetail.type.notNull}")
    @Column(name = "TYPE_")
    protected Integer type;

    @NotNull(message = "{msg://OrderDetail.book.notNull}")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOK_ID")
    protected Book book;

    @NotNull(message = "{msg://OrderDetail.unitPrice.notNull}")
    @Column(name = "UNIT_PRICE")
    protected BigDecimal unitPrice;

    @NotNull(message = "{msg://OrderDetail.amount.notNull}")
    @Column(name = "AMOUNT")
    protected Integer amount;

    @Lob
    @Column(name = "MEMO")
    protected String memo;

    public void setType(TypeEnum type) {
        this.type = type == null ? null : type.getId();
    }

    public TypeEnum getType() {
        return type == null ? null : TypeEnum.fromId(type);
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

}