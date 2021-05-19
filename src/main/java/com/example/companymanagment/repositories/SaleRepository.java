package com.example.companymanagment.repositories;

import com.example.companymanagment.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
