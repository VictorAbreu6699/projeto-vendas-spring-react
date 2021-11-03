package com.victor.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor.dsvendas.entites.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
