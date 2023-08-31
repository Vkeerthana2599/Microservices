package com.keerthi.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.keerthi.productservice.constant.AppConstant;
import com.keerthi.productservice.controller.ProductController;
import com.keerthi.productservice.entity.Product;
import com.keerthi.productservice.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void saveProductDetails(Product product) {
		productRepository.save(product);
	}

	
	public List<Product> findAllProductDetails(){
		return productRepository.findAll();
	}
	
	public Optional<Product> findProductPriceById(Long id) {
		return productRepository.findById(id);
	}
}
