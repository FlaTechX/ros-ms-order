package com.ros.ms_order.domain.repository;

import com.ros.ms_order.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
