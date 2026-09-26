package com.ros.ms_order.api.controller;

import com.ros.ms_order.api.dto.OrderResponseDTO;
import com.ros.ms_order.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {
    private OrderService service;

    @PostMapping
    public OrderResponseDTO createOrder(){
        return service.createOrder();
    }
}
