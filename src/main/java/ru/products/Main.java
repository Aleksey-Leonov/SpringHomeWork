package ru.products;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создаю пустой спринговый контекст для поиска своих бинов в указанном пакете
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.products");

        ProductRepository productRepo = context.getBean(ProductRepository.class);
        System.out.println(productRepo.addProductRepository());


//        System.out.println(product.getName());

    }
}
