package com.ros.ms_order.api.dto;

import com.ros.ms_order.api.dto.request.ProductRequestDTO;
import com.ros.ms_order.api.dto.request.VariantRequestDTO;
import com.ros.ms_order.domain.enums.OrderStatusEnum;

import java.math.BigDecimal;

public record ProductItemDTO(
        ProductRequestDTO product,
        VariantRequestDTO variant,
        Integer quantity,
        BigDecimal unitPrice,
        BigDecimal totalPrice,
        String notes,
        OrderStatusEnum status
) {
}
