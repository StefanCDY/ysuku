package com.company.ysuku.web.category;

import com.company.ysuku.entity.Category;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.TreeTable;

import javax.inject.Inject;

public class CategoryBrowse extends AbstractLookup {
    @Inject
    private TreeTable<Category> categoriesTable;

    @Override
    public void ready() {
        categoriesTable.expandAll();
    }
}