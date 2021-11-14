package com.codecool.bestevershop.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    ProductEntity findById(long id) {
        return productRepository.findById(id).orElseThrow();
    }

    ProductEntity save(ProductEntity productEntity) {
        return productRepository.save(productEntity);
    }

    List<ProductEntity> findAll() {
        return productRepository.findAll();
    }

    Long delete(Long id) {
        return productRepository.delete(id);
    }
}
