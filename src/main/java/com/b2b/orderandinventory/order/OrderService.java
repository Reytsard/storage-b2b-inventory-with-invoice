package com.b2b.orderandinventory.order;

import com.b2b.orderandinventory.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

//    public List<Order> createOrders()
}
