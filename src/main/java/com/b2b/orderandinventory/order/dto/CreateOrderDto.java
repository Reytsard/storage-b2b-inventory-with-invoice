package com.b2b.orderandinventory.order.dto;

import java.util.Map;

public class CreateOrderDto {
    private Map<String, Integer> ordersList; //<SKU, Quantity>
    private Long companyId;

    public CreateOrderDto(Map<String, Integer> ordersList) {
        this.ordersList = ordersList;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Map<String, Integer> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Map<String, Integer> ordersList) {
        this.ordersList = ordersList;
    }
}
