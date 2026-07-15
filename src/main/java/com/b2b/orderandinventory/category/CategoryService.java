package com.b2b.orderandinventory.category;

import com.b2b.orderandinventory.exception.CategoryAlreadyExistsException;
import com.b2b.orderandinventory.exception.CategoryDoesNotExistException;
import org.springframework.stereotype.Service;

import com.b2b.orderandinventory.model.Category;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category save(String name) throws CategoryAlreadyExistsException {
        if(!categoryRepository.existsByNameIgnoreCase(name)){
            Category c = new Category();
            c.setName(name);
            return categoryRepository.save(c);
        }
        throw new CategoryAlreadyExistsException(name);
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(UUID categoryId) {
        return categoryRepository.findById(categoryId).orElseThrow(() -> new CategoryDoesNotExistException(categoryId));
    }
}
