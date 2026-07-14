package com.b2b.orderandinventory.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "orderList")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long referenceId;


    @OneToMany(mappedBy = "item_id")
    private List<OrderItem> items;

    @Column
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @CreatedDate
    @Column
    private LocalDateTime createAt;

    @LastModifiedDate
    @Column
    private LocalDateTime lastModifiedAt;

    public Order() {
    }

    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(LocalDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }
}