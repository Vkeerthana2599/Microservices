package com.keerthi.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("Product-Service")
public interface ProductServiceClient {
	
	@GetMapping(value="/product/getProductPriceById/{id}")
	public double getProductPriceById(@PathVariable("id") Long id);

}
