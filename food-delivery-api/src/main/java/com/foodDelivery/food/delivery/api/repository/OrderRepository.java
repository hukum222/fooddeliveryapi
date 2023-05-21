package com.foodDelivery.food.delivery.api.repository;

import com.foodDelivery.food.delivery.api.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order , Integer> {
}
