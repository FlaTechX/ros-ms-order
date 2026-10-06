package com.ros.ms_order.domain.service.impl;

import com.ros.ms_order.domain.model.Product;
import com.ros.ms_order.domain.repository.ProductRepository;
import com.ros.ms_order.domain.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    @Override
    public List<Product> getProductsByRestaurant() {
        return repository.findByRestaurant(1L);
    }
}
