package com.example.employeemanager;

import com.example.employeemanager.entity.Product;
import com.example.employeemanager.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EmployeemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagerApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(ProductRepo productRepository) {
        return (args) -> {
            //TEST JPA HERE!!!
            Product product1 = new Product(1 , "name 10", "http://placeimg.com/640/480/business", 214);
            Product product2 = new Product(2 , "name 10", "http://placeimg.com/640/480/business", 214);
            System.out.println( productRepository.save(product1));
            productRepository.save(product2);


            List<Product> products = productRepository.findAll();
            for (Product product : products) {
                product.toString();
            }
        };
    }
}
