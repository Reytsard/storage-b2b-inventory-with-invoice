package com.b2b.orderandinventory.exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String email) {
        super("User already Exists by email: "+ email);
    }
}
