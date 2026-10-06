package com.ros.ms_order.domain.service.impl;

import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.api.dto.response.OrderResponseDTO;
import com.ros.ms_order.domain.repository.OrderRepository;
import com.ros.ms_order.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    @Override
    public OrderResponseDTO createOrder(Long tableId, OrderRequestDTO requestDTO) {
        return new OrderResponseDTO();
    }
}
