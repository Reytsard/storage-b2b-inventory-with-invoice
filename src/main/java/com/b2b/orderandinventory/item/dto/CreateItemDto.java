package com.b2b.orderandinventory.item.dto;

import jakarta.annotation.Nullable;

import java.util.List;
import java.util.UUID;

public class CreateItemDto {
    private String sku;

    private String name;

    @Nullable
    private String desc;

    private Integer quantity;

    private Float amount;

    private List<UUID> categoryIds;

    public CreateItemDto(String sku, String name, @Nullable String desc, Integer quantity, Float amount) {
        this.sku = sku;
        this.name = name;
        this.desc = desc;
        this.quantity = quantity;
        this.amount = amount;
    }

    public CreateItemDto() {
    }

    public List<UUID> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<UUID> categoryIds) {
        this.categoryIds = categoryIds;
    }

    public String getSku() {
        return sku;
    }


    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public String getDesc() {
        return desc;
    }

    public void setDesc(@Nullable String desc) {
        this.desc = desc;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}