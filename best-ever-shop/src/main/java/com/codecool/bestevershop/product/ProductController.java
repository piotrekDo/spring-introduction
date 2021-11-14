package com.codecool.bestevershop.product;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    ProductEntity findById(@PathVariable long id) {
        return productService.findById(id);
    }

    @PostMapping
    ProductEntity save(@RequestBody ProductEntity productEntity) {
        return productService.save(productEntity);
    }

    @GetMapping
    List<ProductEntity> findAll() {
        return productService.findAll();
    }

    @DeleteMapping("/{id}")
    Long delete(@PathVariable Long id) {
        return productService.delete(id);
    }
}
