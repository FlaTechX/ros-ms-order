package com.ros.ms_order.api.dto.response;

import com.ros.ms_order.domain.model.Category;

import java.util.List;

public record CategoriesResponseDTO(
        Long id,
        String name,
        String description,
        List<ProductResponseDTO> products
) {
    public static CategoriesResponseDTO from(Category category) {
        return new CategoriesResponseDTO(
                category.getId(),
                category.getName(),
                category.getDescription(),
                category.getProducts().stream().map(ProductResponseDTO::from).toList()
        );
    }
}
