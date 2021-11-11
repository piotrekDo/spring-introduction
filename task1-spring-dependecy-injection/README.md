# Dependency Injection

Try to implement `ProductService` to use `ProductDiscountApplier` to apply discount. \
Use dependecy injection in 3 ways: 
- inject by counstructor
- inject by field
- inject by setter
Which is the best and why?

Create new bean `ProductRepostiory` which will have
```java
    private final List<Product> products = Arrays.asList(
            new Product(BigDecimal.valueOf(23.50)),  
            new Product(BigDecimal.valueOf(23.50))
    );
```

And provide simple get method `public Product get(long id)`

Use this repostiory in `ProductService` by chaning 
```java
public Product getProductBeforeDiscount() ...
public Product getProductAfterDiscount() ...
```
to
```java
public Product getProductBeforeDiscount(long id) ...
public Product getProductAfterDiscount(long id) ...
```
