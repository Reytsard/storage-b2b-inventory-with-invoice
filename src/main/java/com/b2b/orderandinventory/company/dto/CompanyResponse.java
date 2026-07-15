package com.b2b.orderandinventory.company.dto;

import java.time.LocalDateTime;

public class CompanyResponse {
    private Long id;
    private String name;
    private String address;
    private LocalDateTime createAt;
    private LocalDateTime lastUpdatedAt;

    public CompanyResponse() {}

    public CompanyResponse(Long id, String name, String address, LocalDateTime createAt, LocalDateTime lastUpdatedAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.createAt = createAt;
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public LocalDateTime getCreateAt() { return createAt; }
    public void setCreateAt(LocalDateTime createAt) { this.createAt = createAt; }
    public LocalDateTime getLastUpdatedAt() { return lastUpdatedAt; }
    public void setLastUpdatedAt(LocalDateTime lastUpdatedAt) { this.lastUpdatedAt = lastUpdatedAt; }
}
