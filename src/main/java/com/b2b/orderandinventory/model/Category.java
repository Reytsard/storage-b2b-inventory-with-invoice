package com.b2b.orderandinventory.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.util.UUID;

@Entity(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String name;

    public Category(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public Category() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
