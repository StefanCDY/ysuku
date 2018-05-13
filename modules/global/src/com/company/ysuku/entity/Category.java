package com.company.ysuku.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Lob;

import com.haulmont.cuba.core.entity.annotation.OnDelete;

import java.util.List;
import javax.persistence.OneToMany;

import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

/**
 * create by Stefan on 5/12/18
 */
@NamePattern("%s|name")
@Table(name = "YSUKU_CATEGORY")
@Entity(name = "ysuku$Category")
public class Category extends StandardEntity {
    private static final long serialVersionUID = -8676636430021794191L;

    @NotNull(message = "{msg://Category.name.notNull}")
    @Column(name = "NAME")
    protected String name;

    @Lob
    @Column(name = "DESCRIPTION")
    protected String description;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "clear"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_CATEGORY_ID")
    protected Category parentCategory;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "parentCategory")
    protected List<Category> categoryList;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "category")
    protected List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}