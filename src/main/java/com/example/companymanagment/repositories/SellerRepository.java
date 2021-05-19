package com.example.companymanagment.repositories;

import com.example.companymanagment.models.Seller;

import javax.transaction.Transactional;

@Transactional//
public interface SellerRepository extends EmployeeRepository<Seller> {
}
