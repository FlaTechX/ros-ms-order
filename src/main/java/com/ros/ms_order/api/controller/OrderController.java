package com.ros.ms_order.api.controller;

import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.api.dto.response.OrderResponseDTO;
import com.ros.ms_order.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService service;

    @PostMapping("/table/{tableId}")
    public OrderResponseDTO createOrder(@PathVariable Long tableId, @RequestBody OrderRequestDTO requestDTO){
        return service.createOrder(tableId, requestDTO);
    }
}
