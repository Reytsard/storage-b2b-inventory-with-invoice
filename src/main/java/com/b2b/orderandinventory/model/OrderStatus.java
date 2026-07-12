package com.b2b.orderandinventory.model;

import jakarta.persistence.Enumerated;

public enum OrderStatus {
    DRAFT,
    PENDING,
    APPROVED,
    ONTRANSIT,
    DELIVERED
}
