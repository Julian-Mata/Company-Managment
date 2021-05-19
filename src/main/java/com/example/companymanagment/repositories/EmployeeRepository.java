package com.example.companymanagment.repositories;

import com.example.companymanagment.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.NoRepositoryBean;

//@NoRepositoryBean
public interface EmployeeRepository<T extends Employee> extends JpaRepository<T,Long> {
}
