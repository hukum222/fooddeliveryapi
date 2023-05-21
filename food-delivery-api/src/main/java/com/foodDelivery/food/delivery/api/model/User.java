package com.foodDelivery.food.delivery.api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.web.WebProperties;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_user")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "name is mandatory")
    @Column(name = "name")
    private String name;
    @NotNull(message = "email is mandatory")
    @Email(message = "Invalid email address")
    private String email;

    @NotNull(message = "Address is mandatory")
    @Length(min = 5,max = 50)
    private String address;
    @Digits(integer = 10,fraction = 0)
    @Column(name = "phone_number")
    private String phoneNumber;
}
