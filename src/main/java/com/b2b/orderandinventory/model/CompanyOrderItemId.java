package com.b2b.orderandinventory.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.UUID;

@Embeddable
public class CompanyOrderItemId implements Serializable {
    private BigInteger companyId;
    private BigInteger referenceId;

    public CompanyOrderItemId(BigInteger companyId, BigInteger referenceId) {
        this.companyId = companyId;
        this.referenceId = referenceId;
    }

    public BigInteger getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    public BigInteger getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(BigInteger referenceId) {
        this.referenceId = referenceId;
    }
}
