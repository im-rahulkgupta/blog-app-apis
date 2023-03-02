package com.blog.services;

import com.blog.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    //create
    CategoryDto createCategory(CategoryDto categoryDto);

    //update
    CategoryDto updateCategory(CategoryDto categoryDto);

    //delete
    void deleteCategory(int categoryId);

    //get
    CategoryDto getCategory(int categoryId);

    //get All
    List<CategoryDto> getAllCategories();
}
