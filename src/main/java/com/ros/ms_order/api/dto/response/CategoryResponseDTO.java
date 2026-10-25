package com.ros.ms_order.api.dto.response;

import com.ros.ms_order.domain.model.Category;

import java.util.List;

public record CategoryResponseDTO(
        Long id,
        String name,
        String description,
        List<ProductResponseDTO> products
) {
    public static CategoryResponseDTO from(Category category) {
        return new CategoryResponseDTO(
                category.getId(),
                category.getName(),
                category.getDescription(),
                category.getProducts().stream().map(ProductResponseDTO::from).toList()
        );
    }
}
