package com.b2b.orderandinventory.item;

import com.b2b.orderandinventory.exception.StockItemAlreadyExistsException;
import com.b2b.orderandinventory.exception.StockItemDoesNotExistsException;
import com.b2b.orderandinventory.item.dto.CreateItemDto;
import com.b2b.orderandinventory.item.dto.StockInventoryItemResponse;
import com.b2b.orderandinventory.item.dto.UpdateItemDto;
import com.b2b.orderandinventory.mapper.EntityMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController()
@RequestMapping("/item")
@Tag(name = "Items" , description = "controller for CRUD for Stock Company Items")
public class CompanyItemController {
    private final CompanyItemService companyItemService;
    private final EntityMapper mapper;

    public CompanyItemController(CompanyItemService companyItemService, EntityMapper mapper) {
        this.companyItemService = companyItemService;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<StockInventoryItemResponse>> findAll(){
        return ResponseEntity.ok(mapper.toStockItemResponseList(companyItemService.findAll()));
    }

    @GetMapping("/search")
    public ResponseEntity<StockInventoryItemResponse> findBySku(@RequestParam("sku")String sku){
        return ResponseEntity.ok(mapper.toResponse(companyItemService.findBySku(sku)));
    }

    @PostMapping
    public ResponseEntity<StockInventoryItemResponse> save(@RequestBody CreateItemDto createItemDto) throws StockItemAlreadyExistsException {
        return ResponseEntity.ok(mapper.toResponse(companyItemService.save(createItemDto)));
    }

    @PutMapping
    public ResponseEntity<StockInventoryItemResponse> update(@RequestBody UpdateItemDto updateItemDto) throws StockItemDoesNotExistsException {
        return ResponseEntity.ok(mapper.toResponse(companyItemService.update(updateItemDto)));
    }

    @DeleteMapping
    public ResponseEntity<Boolean> delete(@RequestParam("sku") String sku){
        return ResponseEntity.ok(companyItemService.delete(sku));
    }
    
}
