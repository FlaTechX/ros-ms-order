package com.ros.ms_order.api.dto.response;

import com.ros.ms_order.domain.model.Variant;

import java.math.BigDecimal;

public record VariantResponseDTO(
        Long id,
        String name,
        BigDecimal price
) {
    public static VariantResponseDTO from(Variant variant) {
        return new VariantResponseDTO(
                variant.getId(),
                variant.getName(),
                variant.getPrice()
        );
    }
}