package com.ros.ms_order.domain.repository;

import com.ros.ms_order.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByRestaurant(Long restaurant);

}
