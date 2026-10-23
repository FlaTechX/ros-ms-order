package com.ros.ms_order.api.dto.response;


import com.ros.ms_order.domain.enums.OrderStatusEnum;
import com.ros.ms_order.domain.model.Order;

import java.math.BigDecimal;

public record OrderResponseDTO(
        Long id,
        OrderStatusEnum status,
        BigDecimal amount,
        Long tableId
) {
    public static OrderResponseDTO from(Order order) {
        return new OrderResponseDTO(
                order.getId(),
                order.getStatus(),
                order.getAmount(),
                order.getTable().getId()
        );
    }
}
