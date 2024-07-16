package com.example.eshopee.services;

import com.example.eshopee.entites.Category;
import com.example.eshopee.payloads.CategoryDTO;
import com.example.eshopee.payloads.CategoryResponse;

public interface CategoryService {

	CategoryDTO createCategory(Category category);

	CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

	CategoryDTO updateCategory(Category category, Long categoryId);

	String deleteCategory(Long categoryId);
}
