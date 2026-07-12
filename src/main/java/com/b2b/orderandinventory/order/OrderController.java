package com.b2b.orderandinventory.order;

import com.b2b.orderandinventory.company.CompanyService;
import com.b2b.orderandinventory.model.Order;
import com.b2b.orderandinventory.order.dto.OrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;
    private final CompanyService companyService;

    public OrderController(OrderService orderService, CompanyService companyService) {
        this.orderService = orderService;
        this.companyService = companyService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrderByReferenceId(@RequestParam("cid") BigInteger companyId, @RequestParam("oid") BigInteger orderId){
        companyService.findById(companyId);
//        orderService.findById(orderId); add a fucntion that will check if there is an orderId as recieved
        return ResponseEntity.ok(orderService.getOrderByReferenceId(companyId, orderId));
    }
}
