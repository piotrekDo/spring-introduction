package com.codecool.springdependencyinjection;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
