package com.victor.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.dsvendas.entites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
