package com.example.companymanagment.controller;

import com.example.companymanagment.models.Employee;
import com.example.companymanagment.models.Manager;//
import com.example.companymanagment.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//
@RequestMapping("/api/company/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    //get ALl managers
    @GetMapping
    public List<Employee> getAll(){
        List<Employee> all = employeeRepository.findAll();
        return all;
    }
}
