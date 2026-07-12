package com.b2b.orderandinventory.exception;

import java.math.BigInteger;

public class OrderDoesNotExistException extends RuntimeException {
    public OrderDoesNotExistException(BigInteger orderId) {
        super("No Order with id: "+orderId);
    }
}
