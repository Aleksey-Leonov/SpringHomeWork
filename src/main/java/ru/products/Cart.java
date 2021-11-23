package ru.products;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Configuration
public class Cart {
    private static Map<Integer, Product> listCart = new HashMap<>();

    @Bean
    public void doAdd (){
        for (int i = 0; i < ProductRepository.productList.size(); i++) {
            listCart.put(i, ProductRepository.productList.get(i));
        }
    }

    @Bean
    public void doDelete(int id){
        listCart.remove(id);
    }



}
