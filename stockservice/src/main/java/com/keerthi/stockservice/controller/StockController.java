package com.keerthi.stockservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.stockservice.appconstant.AppConstant;
import com.keerthi.stockservice.entity.Stock;
import com.keerthi.stockservice.service.StockService;

@RestController
@RequestMapping(value=AppConstant.STOCK_DETAILS)
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@PostMapping(value=AppConstant.FORWARD_SLASH)
	public void saveStockdetails(@RequestBody Stock stock) {
		stockService.saveStockDetails(stock);
	}
	
//	@GetMapping(value=AppConstant.FIND_ALL_STOCK_BY_STOCKID)
//	public void findStockNumberByStockId(Long id) {
//		stockService.findStockNumberByStockId(id);
//	}
	
	@GetMapping(value=AppConstant.FIND_STOCK_NUMBER_BY_STOCK_ID)
	@ResponseBody
	public Long findByStockId(@PathVariable("id") Long id) {
     return stockService.findStockNumberByStockId(id).get().getStockNumber();
}
}
