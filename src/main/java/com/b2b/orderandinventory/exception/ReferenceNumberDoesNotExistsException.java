package com.b2b.orderandinventory.exception;

public class ReferenceNumberDoesNotExistsException extends RuntimeException {
    public ReferenceNumberDoesNotExistsException(Long referenceNumber) {
        super("Order with Reference number does not exists: "+referenceNumber);
    }
}
