package com.example.demo.controller.product;


import com.example.demo.model.Product;
import com.example.demo.service.product.ProductService;
import com.example.demo.service.product.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductServiceImpl productServiceImpl;
    @GetMapping("/admin/products")
    public  String getAllProducts(Model model){
        List<Product> products = productServiceImpl.findAllProduct();
        model.addAttribute("products",products);
        return "admin/product";
    }
    @GetMapping("/account/products")
    public  String getAllProduct(Model model){
        List<Product> products = productServiceImpl.findAllProduct();
        model.addAttribute("products",products);
        return "user/product";
    }




//    @PostMapping("admin/saveProduct")
//    public  String saveProduct(@RequestBody Product product){
//
//    }



}
