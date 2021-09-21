package com.example;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Supplier;

@Configuration
@AllArgsConstructor
public class ProductReporter {
    private final ProductService service;

    @Bean
    Supplier<Iterable<Product>> reportProducts() {
        return () -> {
            return service.getProducts();
        };
    }
}
