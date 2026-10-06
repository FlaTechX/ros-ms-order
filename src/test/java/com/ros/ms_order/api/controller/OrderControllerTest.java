package com.ros.ms_order.api.controller;

import com.ros.ms_order.api.dto.request.OrderRequestDTO;
import com.ros.ms_order.api.dto.response.OrderResponseDTO;
import com.ros.ms_order.domain.service.OrderService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.databind.ObjectMapper;

import static com.ros.ms_order.domain.enums.OrderStatusEnum.PENDING;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles(profiles = {"test"})
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = OrderController.class)
public class OrderControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private OrderService service;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void shouldCreateOrder() throws Exception {

        var request = OrderRequestDTO.builder()
                .status(PENDING)
                .build();

        var response = OrderResponseDTO.builder()
                .status(PENDING)
                .build();
        when(service.createOrder(anyLong(), any(OrderRequestDTO.class)))
                .thenReturn(response);

        mockMvc.perform(
                        post("/api/v1/order/table/{tableId}", 1L)
                                .contentType(APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(request))
                )
                .andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JSON))
                .andExpect(jsonPath("$.status").value("PENDING"));

        verify(service).createOrder(eq(1L), any(OrderRequestDTO.class));
    }
}
