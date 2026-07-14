package com.b2b.orderandinventory.orderitem;

import com.b2b.orderandinventory.model.OrderItem;

public class OrderItemService {
    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public OrderItem save(OrderItem i){
        return orderItemRepository.save(i);
    }
}
