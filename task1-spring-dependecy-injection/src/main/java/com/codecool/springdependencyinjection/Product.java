package com.codecool.springdependencyinjection;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;

    public Product(BigDecimal price) {
        this.price = price;
    }

    public void applyDiscount(BigDecimal discount){
        this.price = price.subtract(discount);
    }

    public BigDecimal getPrice() {
        return price;
    }
}
