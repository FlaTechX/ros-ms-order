package com.ros.ms_order.domain.service;

import com.ros.ms_order.domain.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductsByRestaurant();

}
