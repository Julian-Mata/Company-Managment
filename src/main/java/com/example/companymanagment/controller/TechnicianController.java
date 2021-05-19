package com.example.companymanagment.controller;


import com.example.companymanagment.models.Technician;
import com.example.companymanagment.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/company/technician")
public class TechnicianController {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Technician> getAll(){
        return employeeRepository.findAll();
    }
}
