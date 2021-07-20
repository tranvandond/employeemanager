package com.example.employeemanager.controller;

import com.example.employeemanager.entity.Product;
import com.example.employeemanager.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/products")
    public List<Product>   getProduct() {
        List<Product> products = productRepo.findAll();
        for(Product p:products){
            System.out.println(p.getName());
        }
        return products;
    }

    @GetMapping("/products2")
    public ResponseEntity<?>  getProduct2() {
        List<Product> products = productRepo.findAll();
        for(Product p:products){
            System.out.println(p.getName());
        }
        return ResponseEntity.ok(products);
    }



}
