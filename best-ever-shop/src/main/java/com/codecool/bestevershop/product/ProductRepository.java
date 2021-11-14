package com.codecool.bestevershop.product;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
class ProductRepository {
    private final List<ProductEntity> products = Arrays.asList(
            new ProductEntity(BigDecimal.valueOf(23.50)),
            new ProductEntity(BigDecimal.valueOf(23.50))
    );

    Optional<ProductEntity> findById(long id) {
        return id > products.size() ? Optional.empty() : Optional.of(products.get((int) id));
    }

    ProductEntity save(ProductEntity productEntity) {
        products.add(productEntity);
        return productEntity;
    }

    List<ProductEntity> findAll() {
        return products;
    }

    Long delete(Long id) {
        products.remove(id);
        return id;
    }
}
