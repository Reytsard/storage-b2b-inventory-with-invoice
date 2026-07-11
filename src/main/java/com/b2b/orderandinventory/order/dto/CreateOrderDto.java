package com.b2b.orderandinventory.order.dto;

import com.b2b.orderandinventory.model.StockInventoryItem;

import java.util.Map;
import java.util.UUID;

public class CreateOrderDto {
    private Map<StockInventoryItem, Integer> ordersList;
    private UUID companyId;
}
