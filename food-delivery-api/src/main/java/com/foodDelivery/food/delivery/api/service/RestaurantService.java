package com.foodDelivery.food.delivery.api.service;

import com.foodDelivery.food.delivery.api.model.Restaurant;
import com.foodDelivery.food.delivery.api.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;
    public Restaurant create_Restaurent(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public List<Restaurant> get_all_Restaurant() {
        return restaurantRepository.findAll();
    }

    public Restaurant get_Restaurant_byId(Integer id) {
        return restaurantRepository.findById(id).get();
    }
}
