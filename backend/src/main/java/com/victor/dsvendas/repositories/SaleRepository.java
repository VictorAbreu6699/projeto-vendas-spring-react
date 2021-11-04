package com.victor.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.victor.dsvendas.dto.SaleSucessDTO;
import com.victor.dsvendas.dto.SaleSumDTO;
import com.victor.dsvendas.entites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.victor.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	public List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.victor.dsvendas.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals))"
			+ "FROM Sale AS obj GROUP BY obj.seller ")
	public List<SaleSucessDTO> sucessGroupedBySeller();
}
