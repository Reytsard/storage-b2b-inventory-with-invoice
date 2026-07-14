package com.b2b.orderandinventory.exception;

public class StockItemAlreadyExistsException extends RuntimeException{
    public StockItemAlreadyExistsException(String sku){
        super("Item already exists, sku: "+sku);
    }
}
