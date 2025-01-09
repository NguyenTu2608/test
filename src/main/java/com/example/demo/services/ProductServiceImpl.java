package com.example.demo.services;

import com.example.demo.entities.Product;
import com.example.demo.reponsitories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(String id, Product product) {
        Product existingProduct = getProductById(id);
        existingProduct.setName(product.getName());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setCreatedDate(product.getCreatedDate());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setDesc(product.getDesc());
        return productRepository.save(existingProduct);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
