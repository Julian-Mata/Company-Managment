package com.example.companymanagment.repositories;

import com.example.companymanagment.models.Employee;
import com.example.companymanagment.models.Manager;

import javax.transaction.Transactional;

@Transactional
public interface ManagerRepository extends EmployeeRepository<Manager> {
}
