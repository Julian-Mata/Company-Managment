package com.example.companymanagment.controller;

import com.example.companymanagment.models.Employee;
import com.example.companymanagment.models.Manager;
import com.example.companymanagment.repositories.EmployeeRepository;
import com.example.companymanagment.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/company/manager")
public class ManagerController {
    @Autowired
    private ManagerRepository managerRepository;

    //get ALl managers
    @GetMapping
    public List<Manager> getAll(){
        List<Manager> all = managerRepository.findAll();
        return all;
    }
}
