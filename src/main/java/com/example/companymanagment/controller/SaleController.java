package com.example.companymanagment.controller;

import com.example.companymanagment.models.Sale;
import com.example.companymanagment.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/company/sales")
public class SaleController {
    @Autowired
    private SaleRepository saleRepository;

    @GetMapping
    public List<Sale> getAll(){
        return saleRepository.findAll();
    }
}
