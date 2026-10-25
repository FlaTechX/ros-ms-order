package com.ros.ms_order.api.dto.response;

import com.ros.ms_order.domain.model.Product;

import java.util.List;

public record ProductResponseDTO (
        Long id,
        String name,
        String description,
        Long imageId,
        List<VariantResponseDTO> variants
){
    public static ProductResponseDTO from(Product product) {
        return new ProductResponseDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getImageId(),
                product.getVariants().stream().map(VariantResponseDTO::from).toList()
        );
    }
}
