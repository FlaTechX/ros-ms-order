package com.ros.ms_order.domain.service;

import com.ros.ms_order.api.dto.OrderResponseDTO;
import com.ros.ms_order.domain.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private OrderRepository repository;

    public OrderResponseDTO createOrder(){
        return new OrderResponseDTO();
    }
}
