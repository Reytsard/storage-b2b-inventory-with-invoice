package com.b2b.orderandinventory.order;

import com.b2b.orderandinventory.company.CompanyService;
import com.b2b.orderandinventory.mapper.EntityMapper;
import com.b2b.orderandinventory.order.dto.CreateOrderDto;
import com.b2b.orderandinventory.order.dto.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    private final CompanyService companyService;
    private final EntityMapper mapper;

    public OrderController(OrderService orderService, CompanyService companyService, EntityMapper mapper) {
        this.orderService = orderService;
        this.companyService = companyService;
        this.mapper = mapper;
    }


    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> getOrderByReferenceId(@RequestParam("cid") Long companyId, @RequestParam("oid") Long orderId){
        companyService.findById(companyId);
        return ResponseEntity.ok(mapper.toResponse(orderService.getOrderByReferenceId(companyId, orderId)));
    }

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody CreateOrderDto createOrderDto){
        return ResponseEntity.ok(mapper.toResponse(orderService.createOrder(createOrderDto)));
    }
}
