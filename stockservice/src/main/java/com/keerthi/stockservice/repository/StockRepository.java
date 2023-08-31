package com.keerthi.stockservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthi.stockservice.entity.Stock;

public interface StockRepository  extends JpaRepository<Stock, Long>{

}
