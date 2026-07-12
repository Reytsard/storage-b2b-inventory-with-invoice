package com.b2b.orderandinventory.item;

import com.b2b.orderandinventory.model.StockInventoryItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/item")
public class CompanyItemController {
    private final CompanyItemService companyItemService;

    public CompanyItemController(CompanyItemService companyItemService) {
        this.companyItemService = companyItemService;
    }

    @GetMapping
    public ResponseEntity<List<StockInventoryItem>> findAll(){
        return ResponseEntity.ok(companyItemService.findAll());
    }

//    @PostMapping
//    public StockInventoryItem save(@RequestBody ) {
//        //TODO: process POST request
//
//        return entity;
//    }
    
}
