package com.ros.ms_order.domain.service;

import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.domain.repository.OrderRepository;
import com.ros.ms_order.domain.service.impl.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class OrderServiceImplTest {
    @Mock
    OrderRepository repository;

    @InjectMocks
    OrderServiceImpl service;

    @Test
    void haveCreateOrderWithSuccess(){
        final var tableId = 1L;
        final var request = new OrderRequestDTO();
        final var response = service.createOrder(tableId, request);
        assertThat(response).isNotNull();
    }
}
