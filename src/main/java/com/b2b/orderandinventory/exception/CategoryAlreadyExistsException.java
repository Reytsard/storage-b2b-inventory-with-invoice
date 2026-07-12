package com.b2b.orderandinventory.exception;

public class CategoryAlreadyExistsException extends Exception {
    public CategoryAlreadyExistsException(String name){
        super("Category Already Exists: "+name);
    }
}
