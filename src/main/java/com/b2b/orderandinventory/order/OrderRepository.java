package com.b2b.orderandinventory.order;

import com.b2b.orderandinventory.model.CompanyOrderItemId;
import com.b2b.orderandinventory.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
