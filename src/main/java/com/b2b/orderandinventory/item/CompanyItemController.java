package com.b2b.orderandinventory.item;

import com.b2b.orderandinventory.exception.StockItemAlreadyExistsException;
import com.b2b.orderandinventory.exception.StockItemDoesNotExistsException;
import com.b2b.orderandinventory.item.dto.CreateItemDto;
import com.b2b.orderandinventory.item.dto.UpdateItemDto;
import com.b2b.orderandinventory.model.StockInventoryItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @GetMapping("/search")
    public ResponseEntity<StockInventoryItem> findBySku(@RequestParam("sku")String sku){
        return ResponseEntity.ok(companyItemService.findBySku(sku));
    }

    @PostMapping
    public ResponseEntity<StockInventoryItem> save(@RequestBody CreateItemDto createItemDto) throws StockItemAlreadyExistsException {
        return ResponseEntity.ok(companyItemService.save(createItemDto));
    }

    @PutMapping
    public ResponseEntity<StockInventoryItem> update(@RequestBody UpdateItemDto updateItemDto) throws StockItemDoesNotExistsException {
        return ResponseEntity.ok(companyItemService.update(updateItemDto));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("sku") String sku){
        return ResponseEntity.ok(companyItemService.delete(sku));
    }
    
}
