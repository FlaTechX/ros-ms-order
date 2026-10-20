package com.ros.ms_order.domain.service;

import com.ros.ms_order.api.dto.response.CategoriesResponseDTO;

import java.util.List;

public interface CategoryService {
    List<CategoriesResponseDTO> getCategoriesByRestaurant(Long restaurantId);
}
