package com.keerthi.stockservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keerthi.stockservice.controller.StockController;
import com.keerthi.stockservice.entity.Stock;
import com.keerthi.stockservice.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;
	
	public void saveStockDetails(Stock stock) {
		stockRepository.save(stock);
	}
	
	public Optional<Stock> findStockNumberByStockId(Long id) {
		return stockRepository.findById(id);
	}

}
