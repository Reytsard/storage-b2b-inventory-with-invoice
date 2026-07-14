package com.b2b.orderandinventory.exception;

public class CategoryAlreadyExistsException extends RuntimeException {
    public CategoryAlreadyExistsException(String name){
        super("Category Already Exists: "+name);
    }
}
