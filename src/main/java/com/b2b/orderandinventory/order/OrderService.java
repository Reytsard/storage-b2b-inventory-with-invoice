package com.b2b.orderandinventory.order;

import com.b2b.orderandinventory.company.CompanyService;
import com.b2b.orderandinventory.exception.OrderDoesNotExistException;
import com.b2b.orderandinventory.item.CompanyItemService;
import com.b2b.orderandinventory.model.*;
import com.b2b.orderandinventory.order.dto.CreateOrderDto;
import com.b2b.orderandinventory.orderitem.OrderItemRepository;
import com.b2b.orderandinventory.referenceNumber.ReferenceNumberService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final ReferenceNumberService referenceNumberService;
    private final CompanyItemService companyItemService;
    private final OrderItemRepository orderItemRepository;
    private final CompanyService companyService;

    public OrderService(
            OrderRepository orderRepository,
            ReferenceNumberService referenceNumberService,
            CompanyItemService companyItemService,
            OrderItemRepository orderItemRepository,
            CompanyService companyService
    ) {
        this.orderRepository = orderRepository;
        this.referenceNumberService = referenceNumberService;
        this.companyItemService = companyItemService;
        this.orderItemRepository = orderItemRepository;
        this.companyService = companyService;
    }

    public Order getOrderByReferenceId(Long companyId, Long orderId) {

        CompanyOrderItemId companyOrderItemId = new CompanyOrderItemId(companyId, orderId);

        Order order = orderRepository.findById(companyOrderItemId).orElseThrow(() -> new OrderDoesNotExistException(orderId));

        return order;
    }

    public Order createOrder(CreateOrderDto createOrderDto) {

        companyService.findById(createOrderDto.getCompanyId());

        Order o = new Order();

        for(Map.Entry<String, Integer> entry: createOrderDto.getOrdersList().entrySet()){
            StockInventoryItem item = companyItemService.findBySku(entry.getKey());

            OrderItem oi = new OrderItem();
            oi.setItem(item);
            oi.setOrder(o);
            oi.setQuantity(entry.getValue());
            oi = orderItemRepository.save(oi);
            o.getItems().add(oi);
            String referenceId = referenceNumberService.generateReferenceNumber();
            o.setReferenceId(());
        }

        o.setStatus(OrderStatus.PENDING);

        return orderRepository.save(o);
    }

//    public List<StockInventoryItem> findById(Long orderId) {
//        return repository.findById(orderId);
//    }

//    public List<Order> createOrders()
}
