package com.b2b.orderandinventory.exception;

public class OrderDoesNotExistException extends RuntimeException {
    public OrderDoesNotExistException(Long orderId) {
        super("No Order with id: "+orderId);
    }
}
