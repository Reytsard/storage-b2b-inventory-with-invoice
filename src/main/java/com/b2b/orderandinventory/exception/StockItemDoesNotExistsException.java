package com.b2b.orderandinventory.exception;

public class StockItemDoesNotExistsException extends RuntimeException{
    public StockItemDoesNotExistsException(String sku){
        super("Item with sku does not exist: "+sku);
    }
}
