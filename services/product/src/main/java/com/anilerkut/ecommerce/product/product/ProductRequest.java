package com.anilerkut.ecommerce.product.product;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductRequest(

        Integer id,

        @NotNull(message = "Product name is required")
        String name,
        @NotNull(message = "Product name is required")
        String description,
        @NotNull(message = "available quantity should be positive")
        double availableQuantity,

        @NotNull(message = "Price should be positive")
        BigDecimal price,

        @NotNull(message = "Price category is required")
        Integer categoryId
) {
}
