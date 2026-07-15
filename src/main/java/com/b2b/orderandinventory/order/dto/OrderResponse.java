package com.b2b.orderandinventory.order.dto;

import com.b2b.orderandinventory.model.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

public class OrderResponse {
    private Long referenceId;
    private List<OrderItemResponse> items;
    private OrderStatus status;
    private LocalDateTime createAt;
    private LocalDateTime lastModifiedAt;

    public OrderResponse() {}

    public Long getReferenceId() { return referenceId; }
    public void setReferenceId(Long referenceId) { this.referenceId = referenceId; }
    public List<OrderItemResponse> getItems() { return items; }
    public void setItems(List<OrderItemResponse> items) { this.items = items; }
    public OrderStatus getStatus() { return status; }
    public void setStatus(OrderStatus status) { this.status = status; }
    public LocalDateTime getCreateAt() { return createAt; }
    public void setCreateAt(LocalDateTime createAt) { this.createAt = createAt; }
    public LocalDateTime getLastModifiedAt() { return lastModifiedAt; }
    public void setLastModifiedAt(LocalDateTime lastModifiedAt) { this.lastModifiedAt = lastModifiedAt; }
}
