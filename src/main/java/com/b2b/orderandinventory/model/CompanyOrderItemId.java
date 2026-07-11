package com.b2b.orderandinventory.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class CompanyOrderItemId implements Serializable {
    private UUID companyId;
    private Long itemId;
}
