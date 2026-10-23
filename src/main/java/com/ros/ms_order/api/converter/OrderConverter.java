package com.ros.ms_order.api.converter;

import com.ros.ms_order.api.dto.ProductItemDTO;
import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.domain.model.Order;
import com.ros.ms_order.domain.model.OrderItem;
import com.ros.ms_order.domain.model.RestaurantTable;

import static com.ros.ms_order.domain.enums.OrderStatusEnum.CREATED;

public class OrderConverter {

    public static Order toOrder(RestaurantTable table, OrderRequestDTO requestDTO) {
        return Order.builder()
                .type(requestDTO.getType())
                .amount(requestDTO.getAmount())
                .items(requestDTO.getProducts().stream().map(OrderConverter::buildProduct).toList())
                .status(CREATED)
                .table(table)
                .build();
    }

    private static OrderItem buildProduct(ProductItemDTO itemDTO) {
        return OrderItem.builder()
                .productName(itemDTO.product().name())
                .variantName(itemDTO.variant().name())
                .notes(itemDTO.notes())
                .quantity(itemDTO.quantity())
                .unitPrice(itemDTO.unitPrice())
                .totalPrice(itemDTO.totalPrice())
                .status(itemDTO.status())
                .build();
    }

}
