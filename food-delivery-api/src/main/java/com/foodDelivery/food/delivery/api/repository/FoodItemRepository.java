package com.foodDelivery.food.delivery.api.repository;

import com.foodDelivery.food.delivery.api.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepository extends JpaRepository<FoodItem , Integer> {
}
