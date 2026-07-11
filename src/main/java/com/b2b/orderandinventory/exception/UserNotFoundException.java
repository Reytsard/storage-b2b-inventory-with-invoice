package com.b2b.orderandinventory.exception;

import java.util.UUID;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(UUID id) {
        super("User Does Not Exist: " + id);
    }
}
