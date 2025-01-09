package com.example.demo.reponsitories;

import com.example.demo.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    // Custom query methods if needed, e.g., findByCategory
    Product findByName(String name);
}
