package com.codecool.springdependencyinjection;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
 class ProductRepository {
    private final List<Product> products = Arrays.asList(
            new Product(BigDecimal.valueOf(23.50)),
            new Product(BigDecimal.valueOf(23.50))
    );

    Optional<Product> get(long id) {
        return id > products.size() ? Optional.empty() : Optional.of(products.get((int) id));
    }
}
