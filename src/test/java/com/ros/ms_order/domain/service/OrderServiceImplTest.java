package com.ros.ms_order.domain.service;

import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.domain.model.Order;
import com.ros.ms_order.domain.model.RestaurantTable;
import com.ros.ms_order.domain.repository.OrderRepository;
import com.ros.ms_order.domain.repository.RestaurantTableRepository;
import com.ros.ms_order.domain.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderServiceImplTest {
    @Mock
    OrderRepository repository;

    @Mock
    RestaurantTableRepository restaurantTableRepository;

    @InjectMocks
    OrderServiceImpl service;

    @Test
    void haveCreateOrderWithSuccess(){
        final var tableId = 1L;
        final var order = mock(Order.class);
        final var table = mock(RestaurantTable.class);
        final var request = mock(OrderRequestDTO.class);

        when(restaurantTableRepository.findById(anyLong()))
                .thenReturn(Optional.of(table));
        when(repository.save(any(Order.class)))
                .thenReturn(order);

        final var response = service.createOrder(tableId, request);
        assertThat(response).isNotNull();
    }
}
