package com.b2b.orderandinventory.item.dto;

import jakarta.annotation.Nullable;

import java.util.List;
import java.util.UUID;

public class UpdateItemDto {
    private String sku;

    private String name;

    @Nullable
    private String desc;

    private Integer quantity;

    private Float amount;

    private List<UUID> categoryIds;

    public UpdateItemDto() {}

    public String getSku() { return sku; }
    public void setSku(String sku) { this.sku = sku; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    @Nullable
    public String getDesc() { return desc; }
    public void setDesc(@Nullable String desc) { this.desc = desc; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public Float getAmount() { return amount; }
    public void setAmount(Float amount) { this.amount = amount; }
    public List<UUID> getCategoryIds() { return categoryIds; }
    public void setCategoryIds(List<UUID> categoryIds) { this.categoryIds = categoryIds; }
}
