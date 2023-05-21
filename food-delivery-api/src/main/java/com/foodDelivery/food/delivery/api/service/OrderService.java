package com.foodDelivery.food.delivery.api.service;

import com.foodDelivery.food.delivery.api.model.Order;
import com.foodDelivery.food.delivery.api.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public Order create_order(Order order){
        return orderRepository.save(order);
    }
    public List<Order> get_all_Orders() {
        return orderRepository.findAll();
    }

    public Order get_order_by_userId(Integer userId) {
        return orderRepository.findById(userId).get();
    }
}
