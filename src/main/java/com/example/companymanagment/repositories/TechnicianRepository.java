package com.example.companymanagment.repositories;

import com.example.companymanagment.models.Technician;

import javax.transaction.Transactional;

@Transactional
public interface TechnicianRepository extends EmployeeRepository <Technician> {
}
