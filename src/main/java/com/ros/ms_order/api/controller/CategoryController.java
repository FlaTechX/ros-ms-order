package com.ros.ms_order.api.controller;

import com.ros.ms_order.api.dto.response.CategoryResponseDTO;
import com.ros.ms_order.domain.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/category")
public class CategoryController {
    private final CategoryService service;

    @GetMapping
    public List<CategoryResponseDTO> getProducts(){
        return service.getCategoriesByRestaurant(1L);
    }
}
