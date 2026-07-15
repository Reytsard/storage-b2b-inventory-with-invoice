package com.b2b.orderandinventory.order.dto;

import com.b2b.orderandinventory.item.dto.StockInventoryItemResponse;

public class OrderItemResponse {
    private Long id;
    private StockInventoryItemResponse item;
    private Integer quantity;

    public OrderItemResponse() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public StockInventoryItemResponse getItem() { return item; }
    public void setItem(StockInventoryItemResponse item) { this.item = item; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
