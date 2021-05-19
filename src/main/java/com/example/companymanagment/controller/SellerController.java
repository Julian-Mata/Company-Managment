package com.example.companymanagment.controller;

import com.example.companymanagment.models.Seller;
import com.example.companymanagment.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/company/seller")
public class SellerController {
    @Autowired
    private SellerRepository sellerRepository;

    @GetMapping
    public List<Seller> getAll(){
        return sellerRepository.findAll();
    }
}
