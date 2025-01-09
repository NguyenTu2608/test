package com.example.demo.services;

import com.example.demo.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(String id);
    Product createProduct(Product product);
    Product updateProduct(String id, Product product);
    void deleteProduct(String id);
}
