package com.foodDelivery.food.delivery.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tbl_FoodItem")
public class FoodItem {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int FoodItem_id;
    @NotNull(message = "Name is mandatory")
    @Column(name="Name")
    private String name;
    @Length(min=5,max=50,message ="Description Length should be in 5-50")
    @NotNull(message = "description is mandatory")
    private String description;
}
