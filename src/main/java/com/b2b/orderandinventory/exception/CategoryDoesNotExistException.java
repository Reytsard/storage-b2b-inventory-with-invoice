package com.b2b.orderandinventory.exception;

import java.util.UUID;

public class CategoryDoesNotExistException extends RuntimeException {
    public CategoryDoesNotExistException(UUID id) {
        super("No category with id: "+ id);
    }
}
