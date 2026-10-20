package com.ros.ms_order.domain.service.impl;

import com.ros.ms_order.api.dto.response.CategoriesResponseDTO;
import com.ros.ms_order.domain.repository.CategoryRepository;
import com.ros.ms_order.domain.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;

    @Override
    public List<CategoriesResponseDTO> getCategoriesByRestaurant(Long restaurantId) {
        return repository.findByRestaurant(restaurantId)
                .stream()
                .map(CategoriesResponseDTO::from)
                .toList();
    }
}
