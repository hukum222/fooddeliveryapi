package com.foodDelivery.food.delivery.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "tbl_Admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Admin_id;
    @Length(min = 5,max = 20,message = "Username Length should be in 5-20")
    @Column(name="Username")
    private String username;
    @Email(message = "enter valid email")
    @NotNull
    @Column(name="Email")
    private String email;
    @Digits(integer = 10,fraction = 0)
    @NotNull
    @Column(name="Phone_number")
    private String phone_number;
    @JoinColumn(name = "FoodList")
    @OneToMany(fetch = FetchType.LAZY)
    private List<FoodItem> foodList;
    @JoinColumn(name = "OrderList")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Order>  orderList;
}
