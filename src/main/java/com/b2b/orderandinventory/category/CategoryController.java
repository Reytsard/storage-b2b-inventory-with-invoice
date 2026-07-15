package com.b2b.orderandinventory.category;

import com.b2b.orderandinventory.category.dto.CategoryResponse;
import com.b2b.orderandinventory.exception.CategoryAlreadyExistsException;
import com.b2b.orderandinventory.mapper.EntityMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;
    private final EntityMapper mapper;

    public CategoryController(CategoryService categoryService, EntityMapper mapper) {
        this.categoryService = categoryService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<CategoryResponse> findAll(){
        return mapper.toResponse(categoryService.findAll());
    }

    @PostMapping
    public CategoryResponse save(String name) throws CategoryAlreadyExistsException {
        return mapper.toResponse(categoryService.save(name));
    }
}
