package com.b2b.orderandinventory.exception;

public class CompanyAlreadyExistsException extends RuntimeException {
    public CompanyAlreadyExistsException(String companyName) {
        super("Company Already Exists: "+ companyName);
    }
}
