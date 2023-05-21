package com.foodDelivery.food.delivery.api.service;

import com.foodDelivery.food.delivery.api.model.Admin;
import com.foodDelivery.food.delivery.api.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;
    public Admin addadmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public List<Admin> get_all_admin() {
        return adminRepository.findAll();
    }
}
