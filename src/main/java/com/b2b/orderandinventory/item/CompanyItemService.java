package com.b2b.orderandinventory.item;

import com.b2b.orderandinventory.model.StockInventoryItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyItemService {
    private final CompanyItemRepository companyItemRepository;

    public CompanyItemService(CompanyItemRepository companyItemRepository) {
        this.companyItemRepository = companyItemRepository;
    }

    public List<StockInventoryItem> findAll(){
        return companyItemRepository.findAll();
    }
}
