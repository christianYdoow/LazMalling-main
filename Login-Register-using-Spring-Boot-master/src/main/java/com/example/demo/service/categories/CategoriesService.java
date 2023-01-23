package com.example.demo.service.categories;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category>getAllCategory(){
        return categoryRepository.findAll();
    }
    public void addCategory(Category category){
        categoryRepository.save(category);
    }
    public void removeCategoryById(long id){
        categoryRepository.deleteById(id);
    }
    public Optional<Category> getCategoryById(long id){
        return categoryRepository.findById(id);
    }
}
