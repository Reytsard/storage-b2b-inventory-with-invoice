package com.b2b.orderandinventory.order;

import com.b2b.orderandinventory.exception.OrderDoesNotExistException;
import com.b2b.orderandinventory.model.CompanyOrderItemId;
import com.b2b.orderandinventory.model.Order;
import com.b2b.orderandinventory.referenceNumber.ReferenceNumberService;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
    private final OrderRepository repository;
    private final ReferenceNumberService referenceNumberService;

    public OrderService(OrderRepository repository, ReferenceNumberService referenceNumberService) {
        this.repository = repository;
        this.referenceNumberService = referenceNumberService;
    }

    public Order getOrderByReferenceId(Long companyId, Long orderId) {

        CompanyOrderItemId companyOrderItemId = new CompanyOrderItemId(companyId, orderId);

        Order order = repository.findById(companyOrderItemId).orElseThrow(() -> new OrderDoesNotExistException(orderId));

        return order;
    }

//    public List<StockInventoryItem> findById(Long orderId) {
//        return repository.findById(orderId);
//    }

//    public List<Order> createOrders()
}
