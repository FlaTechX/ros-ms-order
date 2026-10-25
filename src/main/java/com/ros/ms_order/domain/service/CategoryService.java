package com.ros.ms_order.domain.service;

import com.ros.ms_order.api.dto.response.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryResponseDTO> getCategoriesByRestaurant(Long restaurantId);
}
