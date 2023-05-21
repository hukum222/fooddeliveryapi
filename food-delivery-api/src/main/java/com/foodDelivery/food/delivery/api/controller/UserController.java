package com.foodDelivery.food.delivery.api.controller;

import com.foodDelivery.food.delivery.api.model.User;
import com.foodDelivery.food.delivery.api.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userservice;
    @PostMapping(value = "/create_user")
    public ResponseEntity<String> create_user(@Valid @RequestBody User user){
        User user1=userservice.create_user(user);
        return new ResponseEntity<>(user1+"User created", HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_all_Users")
    public ResponseEntity<String> get_all_Users(){
        List<User> user=userservice.get_all_Users();
        return new ResponseEntity<>(user+"All Users",HttpStatus.ACCEPTED);
    }
    @GetMapping(value = "/get_User_by_Id")
    public ResponseEntity<String> get_User_by_Id(@RequestParam Integer Id){
        User user=userservice.get_User_by_Id(Id);
        return new ResponseEntity<>(user+"Users by "+Id,HttpStatus.ACCEPTED);
    }
}
