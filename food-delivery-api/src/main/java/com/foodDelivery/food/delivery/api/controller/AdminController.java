package com.foodDelivery.food.delivery.api.controller;

import com.foodDelivery.food.delivery.api.model.Admin;
import com.foodDelivery.food.delivery.api.model.FoodItem;
import com.foodDelivery.food.delivery.api.service.AdminService;
import com.foodDelivery.food.delivery.api.service.FoodItemService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    FoodItemService foodItemService;
    @Autowired
    AdminService adminService;
    @PostMapping(value = "/addAdmin")
    public ResponseEntity<String> addAdmin(@Valid @RequestBody Admin admin){
        adminService.addadmin(admin);
        return new ResponseEntity<>("Admin is created", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_all_admin")
    public ResponseEntity<String> get_all_admin(){
        List<Admin> admins=adminService.get_all_admin();
        return new ResponseEntity<>(admins+"all Admins", HttpStatus.ACCEPTED);
    }
    @PostMapping(value="/Admin/add-food_item")
    public ResponseEntity<String> createFood(@Valid @RequestBody FoodItem foodItem){
        foodItemService.createfood(foodItem);
        return new ResponseEntity<>("food item is Created", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/Admin/get_All_foodItems")
    public ResponseEntity<String> get_All_foodItems(){
        List<FoodItem> foods= foodItemService.get_All_foodItems();
        return new ResponseEntity<>(foods+"all food items",HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/Admin/get_foodItem_byId")
    public ResponseEntity<String> get_foodItem_byId(@RequestParam Integer FoodItem_id){
        FoodItem food= foodItemService.get_foodItem_byId(FoodItem_id);
        return new ResponseEntity<> (food+"your food Item",HttpStatus.ACCEPTED);
    }
    @DeleteMapping(value = "/Admin/delete_foodItem_byId")
    public ResponseEntity<String>delete_foodItem_byId(@RequestParam Integer FoodItem_id){
        foodItemService.delete_fooditem_byid(FoodItem_id);
        return new ResponseEntity<>("Food item is deleted successfully", HttpStatus.OK);
    }
    @PutMapping(value = "/Admin/update-food-item/{foodId}")
    public ResponseEntity updateFood(@PathVariable Integer foodId,@RequestBody FoodItem foodItem){
        foodItemService.update_fooditem(foodId,foodItem);
        return new ResponseEntity<>("food item is updated",HttpStatus.ACCEPTED);
    }
}
