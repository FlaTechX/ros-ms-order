package com.ros.ms_order.domain.repository;

import com.ros.ms_order.domain.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByRestaurant(Long restaurant);
}
