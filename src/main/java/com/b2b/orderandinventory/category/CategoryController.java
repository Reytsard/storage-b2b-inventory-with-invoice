package com.b2b.orderandinventory.category;

import com.b2b.orderandinventory.exception.CategoryAlreadyExistsException;
import com.b2b.orderandinventory.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @PostMapping
    public Category save(String name) throws CategoryAlreadyExistsException {
        return categoryService.save(name);
    }
}
