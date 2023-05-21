package com.foodDelivery.food.delivery.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Restaurant_id;
    @NotNull(message = "Name is mandatory")
    @Length(min = 5,max = 20)
    private String name;
    @NotNull(message = "Address is mandatory")
    @Length(min = 5,max = 50)
    private String address;
    @OneToMany
    @Column(name="FoodItems")
    private List<FoodItem> foodItems;
}

