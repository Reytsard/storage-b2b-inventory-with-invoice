package com.b2b.orderandinventory.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class CompanyOrderItemId implements Serializable {
    private Long companyId;
    private Long referenceId;

    public CompanyOrderItemId(Long companyId, Long referenceId) {
        this.companyId = companyId;
        this.referenceId = referenceId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }
}
