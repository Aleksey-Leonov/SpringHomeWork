package ru.products;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Configuration
public class ProductRepository {
    public static List<Product> productList = new ArrayList<>();

    @Bean
    public List<Product> addProductRepository() {
        for (int i = 1; i <= 5; i++) {
            productList.add(new Product());
        }

        return productList;
    }
}
