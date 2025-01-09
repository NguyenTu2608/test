package com.example.demo.entities;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "products") // This marks the class as a MongoDB document
public class Product {

    @Id
    private String id; // Unique identifier

    private String name; // Product name
    private String category; // Product category
    private Date createdDate; // Creation date
    private double price; // Product price
    private String desc; // Product description

    // Constructors
    public Product() {
    }

    public Product(String id, String name, String category, Date createdDate, double price, String desc) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.createdDate = createdDate;
        this.price = price;
        this.desc = desc;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
