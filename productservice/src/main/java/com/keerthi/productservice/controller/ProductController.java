package com.keerthi.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.productservice.constant.AppConstant;
import com.keerthi.productservice.entity.Product;
import com.keerthi.productservice.repository.ProductRepository;
import com.keerthi.productservice.service.ProductService;

@RestController
@RequestMapping(value=AppConstant.FORWARD_SLASH)

public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value=AppConstant.SAVE_PRODUCT_DETAILS)

	public void saveProductDetails(@RequestBody Product product) {
		productService.saveProductDetails(product);
	}
	
	@GetMapping(value=AppConstant.FIND_ALL_PRODUCT_DETAILS)
	@ResponseBody
	public List<Product> findAll(){
		return productService.findAllProductDetails();
	}
	
	@GetMapping(value=AppConstant.FIND_PRODUCT_PRICE_BY_ID)
	@ResponseBody
	
	public double findProductPriceById(@PathVariable("id")Long id) {
		return productService.findProductPriceById(id).get().getPrice();
	}

}
