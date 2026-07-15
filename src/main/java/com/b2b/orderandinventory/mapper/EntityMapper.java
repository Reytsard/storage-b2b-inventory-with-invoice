package com.b2b.orderandinventory.mapper;

import com.b2b.orderandinventory.category.dto.CategoryResponse;
import com.b2b.orderandinventory.company.dto.CompanyResponse;
import com.b2b.orderandinventory.item.dto.StockInventoryItemResponse;
import com.b2b.orderandinventory.model.Category;
import com.b2b.orderandinventory.model.Company;
import com.b2b.orderandinventory.model.Order;
import com.b2b.orderandinventory.model.OrderItem;
import com.b2b.orderandinventory.model.StockInventoryItem;
import com.b2b.orderandinventory.model.User;
import com.b2b.orderandinventory.order.dto.OrderItemResponse;
import com.b2b.orderandinventory.order.dto.OrderResponse;
import com.b2b.orderandinventory.user.dto.UserResponse;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class EntityMapper {

    public CategoryResponse toResponse(Category category) {
        if (category == null) return null;
        return new CategoryResponse(category.getId(), category.getName());
    }

    public List<CategoryResponse> toResponse(List<Category> categories) {
        if (categories == null) return Collections.emptyList();
        return categories.stream().map(this::toResponse).toList();
    }

    public CompanyResponse toResponse(Company company) {
        if (company == null) return null;
        return new CompanyResponse(
                company.getId(),
                company.getName(),
                company.getAddress(),
                company.getCreateAt(),
                company.getLastUpdatedAt()
        );
    }

    public List<CompanyResponse> toCompanyResponseList(List<Company> companies) {
        if (companies == null) return Collections.emptyList();
        return companies.stream().map(this::toResponse).toList();
    }

    public StockInventoryItemResponse toResponse(StockInventoryItem item) {
        if (item == null) return null;
        StockInventoryItemResponse r = new StockInventoryItemResponse();
        r.setId(item.getId());
        r.setName(item.getName());
        r.setDescription(item.getDescription());
        r.setQuantity(item.getQuantity());
        r.setSku(item.getSku());
        r.setCategory(toResponse(item.getCategory()));
        r.setCreateAt(item.getCreateAt());
        r.setUpdatedAt(item.getUpdatedAt());
        return r;
    }

    public List<StockInventoryItemResponse> toStockItemResponseList(List<StockInventoryItem> items) {
        if (items == null) return Collections.emptyList();
        return items.stream().map(this::toResponse).toList();
    }

    public UserResponse toResponse(User user) {
        if (user == null) return null;
        UserResponse r = new UserResponse();
        r.setId(user.getId());
        r.setFirstName(user.getFirstName());
        r.setLastName(user.getLastName());
        r.setMiddleName(user.getMiddleName());
        r.setEmail(user.getEmail());
        r.setCompany(toResponse(user.getCompany()));
        r.setCreateAt(user.getCreateAt());
        r.setLastModifiedAt(user.getLastModifiedAt());
        return r;
    }

    public List<UserResponse> toUserResponseList(List<User> users) {
        if (users == null) return Collections.emptyList();
        return users.stream().map(this::toResponse).toList();
    }

    public OrderItemResponse toResponse(OrderItem orderItem) {
        if (orderItem == null) return null;
        OrderItemResponse r = new OrderItemResponse();
        r.setId(orderItem.getId());
        r.setQuantity(orderItem.getQuantity());
        r.setItem(toResponse(orderItem.getItem()));
        return r;
    }

    public List<OrderItemResponse> toResponseListFromOrderItems(List<OrderItem> items) {
        if (items == null) return Collections.emptyList();
        return items.stream().map(this::toResponse).toList();
    }

    public OrderResponse toResponse(Order order) {
        if (order == null) return null;
        OrderResponse r = new OrderResponse();
        r.setReferenceId(order.getReferenceId());
        r.setItems(toResponseListFromOrderItems(order.getItems()));
        r.setStatus(order.getStatus());
        r.setCreateAt(order.getCreateAt());
        r.setLastModifiedAt(order.getLastModifiedAt());
        return r;
    }
}
