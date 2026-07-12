package com.b2b.orderandinventory.referenceNumber;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ReferenceNumberService {
    public String generateReferenceNumber(){
        return UUID.randomUUID().toString();
    }
}
