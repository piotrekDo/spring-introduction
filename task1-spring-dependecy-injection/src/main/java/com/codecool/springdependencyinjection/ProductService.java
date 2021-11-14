package com.codecool.springdependencyinjection;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ProductService {

    private final ProductDiscountApplier productDiscountApplier;
    private final ProductRepository productRepository;

    public ProductService(ProductDiscountApplier productDiscountApplier, ProductRepository productRepository) {
        this.productDiscountApplier = productDiscountApplier;
        this.productRepository = productRepository;
    }

    public Product getProductBeforeDiscount(long id){
         return productRepository.get(id).orElseThrow(() -> {
             throw new NoSuchElementException("No product found with ID: " + id);
         });
    }

    public Product getProductAfterDiscount(long id){
        Product product = productRepository.get(id).orElseThrow(() -> {
            throw new NoSuchElementException("No product found with ID: " + id);
        });
        return productDiscountApplier.applyDiscount(product);
    }
}
