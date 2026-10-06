package com.ros.ms_order.api.controller;

import com.ros.ms_order.domain.model.Product;
import com.ros.ms_order.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    @PostMapping
    public List<Product> getProducts(){
        return service.getProductsByRestaurant();
    }
}
