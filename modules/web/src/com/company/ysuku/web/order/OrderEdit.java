package com.company.ysuku.web.order;

import com.company.ysuku.entity.OrderDetail;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.ysuku.entity.Order;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.data.CollectionDatasource;

import javax.inject.Inject;
import java.util.UUID;

public class OrderEdit extends AbstractEditor<Order> {
    @Inject
    private CollectionDatasource<OrderDetail, UUID> detailListDs;
    @Inject
    private Metadata metadata;

    public void onCreate(Component source) {
        detailListDs.addItem(metadata.create(OrderDetail.class));
    }
}