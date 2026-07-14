package com.b2b.orderandinventory.orderitem;

import com.b2b.orderandinventory.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
