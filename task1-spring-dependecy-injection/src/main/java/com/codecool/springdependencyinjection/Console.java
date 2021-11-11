package com.codecool.springdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Console {

    private final ProductService productService;

    @Autowired
    public Console(ProductService productService) {
        this.productService = productService;
    }

    @PostConstruct
    public void printToConsole(){
        System.out.println("Before discount");
        Product product = productService.getProductBeforeDiscount();
        System.out.println(product.getPrice());

        System.out.println("After discount");
        product = productService.getProductAfterDiscount();
        System.out.println(product.getPrice());
    }
}
