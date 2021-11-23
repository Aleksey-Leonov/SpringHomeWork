package ru.products;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class Product {

    private int id;
    private String name;
    private double price;


    public Product() {
        this.id = (int) (Math.random() * 10);
        this.name = "Paper";
        this.price = 50.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
