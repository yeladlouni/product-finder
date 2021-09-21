package com.example;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Iterable<Product> getProducts() {
        var p1 = new Product(10001L, "Macbook Pro", "Apple", 1200.00, 12.0,
                10.1, 2.22, 2, "green", "electronics", Instant.now(),
                false);
        var p2 = new Product(10002L, "Surface Pro", "Microsoft", 2200.00, 12.0,
                10.1, 2.22, 2, "green", "electronics", Instant.now(),
                false);
        var p3 = new Product(10003L, "Yoga Idea", "Lenovo", 3200.00, 12.0,
                10.1, 2.22, 2, "green", "electronics", Instant.now(),
                false);

        repository.findAll().forEach(System.out::println);

        return repository.saveAll(List.of(p1, p2, p3));
    }
}
