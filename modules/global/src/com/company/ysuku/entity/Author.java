package com.company.ysuku.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

import java.util.List;
import javax.persistence.OneToMany;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

/**
 * create by Stefan on 5/12/18
 */
@NamePattern("%s|name")
@Table(name = "YSUKU_AUTHOR")
@Entity(name = "ysuku$Author")
public class Author extends StandardEntity {
    private static final long serialVersionUID = -9123254971806727310L;

    @NotNull(message = "{msg://Author.name.notNull}")
    @Column(name = "NAME")
    protected String name;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Lob
    @Column(name = "MEMO")
    protected String memo;

    @OneToMany(mappedBy = "author")
    protected List<Book> bookList;

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMemo() {
        return memo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}