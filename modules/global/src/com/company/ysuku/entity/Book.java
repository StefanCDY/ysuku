package com.company.ysuku.entity;

import com.haulmont.chile.core.annotations.NamePattern;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

/**
 * create by Stefan on 5/12/18
 */
@NamePattern("%s|name")
@Table(name = "YSUKU_BOOK")
@Entity(name = "ysuku$Book")
public class Book extends StandardEntity {
    private static final long serialVersionUID = -4429833050029370804L;

    @NotNull(message = "{msg://Book.name.notNull}")
    @Column(name = "NAME")
    protected String name;

    @NotNull(message = "{msg://Book.category.notNull}")
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID")
    protected Category category;

    @NotNull(message = "{msg://Book.author.notNull}")
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTHOR_ID")
    protected Author author;

    @NotNull(message = "{msg://Book.publisher.notNull}")
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PUBLISHER_ID")
    protected Publisher publisher;

    @Column(name = "ISBN")
    protected String isbn;

    @Column(name = "SALE_PRICE")
    protected BigDecimal sale_price;

    @Column(name = "PURCHASE_PRICE")
    protected BigDecimal purchase_price;

    @Column(name = "DISCOUNT_PRICE")
    protected BigDecimal discount_price;

    @Column(name = "PAGE_COUNT")
    protected Integer pageCount;

    @Column(name = "WORD_COUNT")
    protected Integer wordCount;

    @Temporal(TemporalType.DATE)
    @Column(name = "PUBLISH_DATE")
    protected Date publishDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "PRINT_DATE")
    protected Date printDate;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Lob
    @Column(name = "MEMO")
    protected String memo;

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPrintDate(Date printDate) {
        this.printDate = printDate;
    }

    public Date getPrintDate() {
        return printDate;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setSale_price(BigDecimal sale_price) {
        this.sale_price = sale_price;
    }

    public BigDecimal getSale_price() {
        return sale_price;
    }

    public void setPurchase_price(BigDecimal purchase_price) {
        this.purchase_price = purchase_price;
    }

    public BigDecimal getPurchase_price() {
        return purchase_price;
    }

    public void setDiscount_price(BigDecimal discount_price) {
        this.discount_price = discount_price;
    }

    public BigDecimal getDiscount_price() {
        return discount_price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}