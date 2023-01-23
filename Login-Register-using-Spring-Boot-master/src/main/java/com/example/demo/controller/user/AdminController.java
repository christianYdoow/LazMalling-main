package com.example.demo.controller.user;

import com.example.demo.dto.product.ProductDto;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.categories.CategoriesService;
import com.example.demo.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class AdminController {

    @Autowired
    private CategoriesService categoriesService;
    @Autowired
    private ProductService productService;
    @Autowired
    private UserRepository userRepository;


//    -----------------ADMIN DASHBOARD -------------------------------------------------

    @GetMapping("/admin/dashboard")
    public  String adminDashboard(){
        return "admin/dashboard";
    }
//-----------------------------------------ADMIN CATEGORIES -------------------------------------
    @GetMapping("/admin/categories")
    public String categories(Model model){
        model.addAttribute("categories",categoriesService.getAllCategory());
        return  "admin/categories";
    }
    @GetMapping("/admin/categories/add")
    public  String getCategoriesAdd(Model model){
        model.addAttribute("category",new Category());
        return "admin/categoriesAdd";
    }
    @PostMapping("/admin/categories/add")
    public  String postCategoriesAdd(@ModelAttribute("categories") Category category){
        categoriesService.addCategory(category);
        return "redirect:/admin/categories";
    }
    @GetMapping("/admin/categories/delete/{id}")
    public String deleteCategory(@PathVariable long id){
        categoriesService.removeCategoryById(id);
        return "redirect:/admin/categories";
    }
    @GetMapping("/admin/categories/update/{id}")
    public String updateCategory(@PathVariable long id,Model model){
        Optional<Category>category=categoriesService.getCategoryById(id);
        if(category.isPresent()){
            model.addAttribute("category",category.get());
            return "admin/categoriesAdd";
        }else {
            return "404";
        }
    }

//    ---------------------------------ADMIN PRODUCT -----------------------------------------------
    @GetMapping("/admin/product")
    public  String adminProduct(){
        return "admin/product";
    }
    @GetMapping("admin/products")
    public  String products(Model model){
        model.addAttribute("products",productService.getAllProduct());
        return "admin/product";
    }
    @GetMapping("admin/products/add")
    public  String getAddProduct(Model model){
        model.addAttribute("productDto",new ProductDto());
        model.addAttribute("categories",categoriesService.getAllCategory());
        return "admin/product";
    }


}
