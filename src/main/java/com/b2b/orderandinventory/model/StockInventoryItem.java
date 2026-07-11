package com.b2b.orderandinventory.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "items")
@EntityListeners(AuditingEntityListener.class)
public class StockInventoryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private Long quantity;

    @Column
    @OneToMany
    private List<Category> category;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime createAt;

    @Column(nullable = false)
    @LastModifiedDate
    private LocalDateTime updatedAt;

    public StockInventoryItem() {
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getQuantity() {
        return quantity;
    }


    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }
}
