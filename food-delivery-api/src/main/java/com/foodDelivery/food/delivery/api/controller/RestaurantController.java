package com.foodDelivery.food.delivery.api.controller;

import com.foodDelivery.food.delivery.api.model.Restaurant;
import com.foodDelivery.food.delivery.api.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @PostMapping(value = "/create_Restaurant")
    public ResponseEntity<String> create_Restaurant(@RequestBody Restaurant restaurant){
        restaurantService.create_Restaurent(restaurant);
        return new ResponseEntity<>("Restaurant is added", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_all_Restaurant")
    public ResponseEntity<String> get_all_Restaurant(){
        List<Restaurant> restaurants=restaurantService.get_all_Restaurant();
        return new ResponseEntity<>(restaurants+"all Restaurants",HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_Restaurant_byId")
    public ResponseEntity<String> get_Restaurant_byId(@RequestParam Integer id){
        Restaurant restaurant=restaurantService.get_Restaurant_byId(id);
        return new ResponseEntity<>(restaurant+"Restaurant"+id,HttpStatus.ACCEPTED);
    }
}
