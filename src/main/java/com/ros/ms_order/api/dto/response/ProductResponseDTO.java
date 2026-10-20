package com.ros.ms_order.api.dto.response;

import com.ros.ms_order.domain.model.Variant;

import java.math.BigDecimal;

public record ProductResponseDTO (
        Long id,
        String name,
        String description,
        String varianteName,
        BigDecimal price
){
    public static ProductResponseDTO from(Variant variant) {
        return new ProductResponseDTO(
                variant.getId(),
                variant.getProduct().getName(),
                variant.getProduct().getDescription(),
                variant.getName(),
                variant.getPrice()
        );
    }
}
