package com.b2b.orderandinventory.item;

import com.b2b.orderandinventory.category.CategoryService;
import com.b2b.orderandinventory.exception.StockItemAlreadyExistsException;
import com.b2b.orderandinventory.exception.StockItemDoesNotExistsException;
import com.b2b.orderandinventory.item.dto.CreateItemDto;
import com.b2b.orderandinventory.item.dto.UpdateItemDto;
import com.b2b.orderandinventory.model.Category;
import com.b2b.orderandinventory.model.StockInventoryItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CompanyItemService {
    private final CompanyItemRepository companyItemRepository;
    private final CategoryService categoryService;

    public CompanyItemService(CompanyItemRepository companyItemRepository,
                              CategoryService categoryService) {
        this.companyItemRepository = companyItemRepository;
        this.categoryService = categoryService;
    }

    public List<StockInventoryItem> findAll(){
        return companyItemRepository.findAll();
    }

    public StockInventoryItem save(CreateItemDto createItemDto)  {
        List<Category> categories = new ArrayList<>();
        for(UUID categoryId : createItemDto.getCategoryIds()){
            categories.add(categoryService.findById(categoryId));
        }

        if(companyItemRepository.existsBySkuIgnoreCase(createItemDto.getSku())){
            throw new StockItemAlreadyExistsException(createItemDto.getSku());
        }

        StockInventoryItem item = new StockInventoryItem();
        item.setSku(createItemDto.getSku());
        item.setDescription(createItemDto.getDesc());
        item.setCategory(categories);
        item.setName(createItemDto.getName());
        item.setQuantity(createItemDto.getQuantity());

        return companyItemRepository.save(item);
    }

    public StockInventoryItem update(UpdateItemDto updateItemDto)  {

        StockInventoryItem item = companyItemRepository.findBySkuIgnoreCase(updateItemDto.getSku()).orElseThrow(() -> new StockItemDoesNotExistsException(updateItemDto.getSku()));
        item.setSku(updateItemDto.getSku());
        item.setDescription(updateItemDto.getDesc());

        if (updateItemDto.getCategoryIds() != null) {
            List<Category> categories = new ArrayList<>();
            for (UUID categoryId : updateItemDto.getCategoryIds()) {
                categories.add(categoryService.findById(categoryId));
            }
            item.setCategory(categories);
        }

        item.setName(updateItemDto.getName());
        item.setQuantity(updateItemDto.getQuantity());

        return companyItemRepository.save(item);
    }

    public Boolean delete(String sku) {
        StockInventoryItem item = companyItemRepository.findBySkuIgnoreCase(sku).orElseThrow(() -> new StockItemDoesNotExistsException(sku));
        companyItemRepository.delete(item);
        return true;
    }

    public StockInventoryItem findBySku(String sku) {
        return companyItemRepository.findBySkuIgnoreCase(sku).orElseThrow(() -> new StockItemDoesNotExistsException(sku));
    }
}
