package com.ros.ms_order.domain.service.impl;

import com.ros.ms_order.api.converter.OrderConverter;
import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.api.dto.response.OrderResponseDTO;
import com.ros.ms_order.domain.exception.TableNotFoundException;
import com.ros.ms_order.domain.repository.OrderRepository;
import com.ros.ms_order.domain.repository.RestaurantTableRepository;
import com.ros.ms_order.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;
    private final RestaurantTableRepository restaurantTableRepository;

    @Override
    public OrderResponseDTO createOrder(Long tableId, OrderRequestDTO requestDTO) {
        final var table = restaurantTableRepository.findById(tableId).orElseThrow(TableNotFoundException::new);
        final var order = OrderConverter.toOrder(table, requestDTO);
        this.repository.save(order);
        return OrderResponseDTO.from(order);
    }
}
