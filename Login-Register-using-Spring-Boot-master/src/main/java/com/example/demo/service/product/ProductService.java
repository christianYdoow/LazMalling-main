package com.example.demo.service.product;

import com.example.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAllProduct();

    Optional<Product> findById(Long productId);

//    List<Product> findAllById(List<Long> ids);

    Product createNewProduct(Product product);

    Product updateProduct(Long productId , Product product);

    void deleteProduct(Long productId);

}
