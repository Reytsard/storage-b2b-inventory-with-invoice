package com.b2b.orderandinventory.order.dto;

import com.b2b.orderandinventory.model.CompanyOrderItemId;
import com.b2b.orderandinventory.model.Order;
import com.b2b.orderandinventory.model.OrderStatus;

import java.util.Map;

public class OrderResponse {
    public OrderStatus status;
    public Map<Order, CompanyOrderItemId> list;
}
