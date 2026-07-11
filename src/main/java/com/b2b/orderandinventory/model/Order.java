package com.b2b.orderandinventory.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "orderList")
public class Order {

    @EmbeddedId
    private CompanyOrderItemId id;

    @Column
    private Integer quantity;
}
