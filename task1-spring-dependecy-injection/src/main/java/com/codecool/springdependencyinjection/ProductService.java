package com.codecool.springdependencyinjection;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductService {

    private final Product product = new Product(BigDecimal.valueOf(23.50));

    public Product getProductBeforeDiscount(){
        return product;
    }

    public Product getProductAfterDiscount(){
        //apply discount here

        throw new IllegalArgumentException("Not Implemented Yet!!!");
    }
}
