package com.b2b.orderandinventory.item.dto;

import com.b2b.orderandinventory.category.dto.CategoryResponse;

import java.time.LocalDateTime;
import java.util.List;

public class StockInventoryItemResponse {
    private Long id;
    private String name;
    private String description;
    private Integer quantity;
    private String sku;
    private List<CategoryResponse> category;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;

    public StockInventoryItemResponse() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }
    public List<CategoryResponse> getCategory() { return category; }
    public void setCategory(List<CategoryResponse> category) { this.category = category; }
    public LocalDateTime getCreateAt() { return createAt; }
    public void setCreateAt(LocalDateTime createAt) { this.createAt = createAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
