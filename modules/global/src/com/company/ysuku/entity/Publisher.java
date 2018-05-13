package com.company.ysuku.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

import java.util.List;

/**
 * create by Stefan on 5/12/18
 */
@NamePattern("%s|name")
@Table(name = "YSUKU_PUBLISHER")
@Entity(name = "ysuku$Publisher")
public class Publisher extends StandardEntity {
    private static final long serialVersionUID = -2744696855052102951L;

    @NotNull(message = "{msg://Publisher.name.notNull}")
    @Column(name = "NAME")
    protected String name;

    @Column(name = "NAME_EN")
    protected String name_en;

    @Lob
    @Column(name = "ADDRESS")
    protected String address;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @OneToMany(mappedBy = "publisher")
    protected List<Book> bookList;

    @Lob
    @Column(name = "MEMO")
    protected String memo;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getName_en() {
        return name_en;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

}