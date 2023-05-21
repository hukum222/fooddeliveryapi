package com.foodDelivery.food.delivery.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_Order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int Order_id;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user_id;
    @OneToOne
    @JoinColumn(name = "FoodItem_id")
    private FoodItem FoodItem_id;
}
