package com.ros.ms_order.api.dto.request;

import com.ros.ms_order.api.dto.ProductItemDTO;
import com.ros.ms_order.domain.enums.OrderStatusEnum;
import com.ros.ms_order.domain.enums.OrderTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDTO {
    private OrderTypeEnum type;
    private OrderStatusEnum status;
    private BigDecimal amount;
    private List<ProductItemDTO> products;
    private Long tableId;
}
