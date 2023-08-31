package com.keerthi.stockservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.keerthi.stockservice.controller.StockController;
import com.keerthi.stockservice.entity.Stock;
import com.keerthi.stockservice.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(StockService.class);
	
	public void saveStockDetails(Stock stock) {
		
		LOGGER.info("information");
		stockRepository.save(stock);
		System.out.println("this is stock service");
	}
	
	public Optional<Stock> findStockNumberByStockId(Long id) {
		return stockRepository.findById(id);
	}

}
