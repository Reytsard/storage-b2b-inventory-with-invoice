package com.b2b.orderandinventory.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import jakarta.persistence.Enumerated;

public enum OrderStatus {
    @JsonEnumDefaultValue DRAFT,
    PENDING,
    APPROVED,
    ONTRANSIT,
    DELIVERED
}
