package com.foodDelivery.food.delivery.api.repository;

import com.foodDelivery.food.delivery.api.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository  extends JpaRepository<Admin,Integer> {
}
