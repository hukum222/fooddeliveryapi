package com.foodDelivery.food.delivery.api.repository;

import com.foodDelivery.food.delivery.api.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository  extends JpaRepository<Restaurant,Integer> {
}
