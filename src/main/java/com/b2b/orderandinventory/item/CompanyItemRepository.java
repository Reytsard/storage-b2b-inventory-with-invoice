package com.b2b.orderandinventory.item;

import com.b2b.orderandinventory.model.StockInventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyItemRepository extends JpaRepository<StockInventoryItem, Long> {
}
