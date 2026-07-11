package com.b2b.orderandinventory.exception;

public class CompanyDoesNotExistException extends RuntimeException {
    public CompanyDoesNotExistException(String name) {
        super("Company does not exists with name: " + name);
    }
}
