package com.ros.ms_order.domain.service;

import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.api.dto.response.OrderResponseDTO;

public interface OrderService {
    OrderResponseDTO createOrder(Long tableId, OrderRequestDTO requestDTO);
}
