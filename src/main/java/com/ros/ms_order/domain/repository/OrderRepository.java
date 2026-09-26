package com.ros.ms_order.domain.repository;

import com.ros.ms_order.domain.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Long, Order> {
}
