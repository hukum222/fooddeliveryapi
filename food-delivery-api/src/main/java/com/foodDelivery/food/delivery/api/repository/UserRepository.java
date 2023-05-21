package com.foodDelivery.food.delivery.api.repository;

import com.foodDelivery.food.delivery.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
