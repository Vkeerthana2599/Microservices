package com.keerthi.orderservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthi.orderservice.appconstant.AppConstant;
import com.keerthi.orderservice.dto.OrderDto;
import com.keerthi.orderservice.service.OrderService;

@RestController
@RequestMapping(value=AppConstant.FORWARD_SLASH)
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
	
	//@Autowired
	//private KafkaTemplate<String , EmailDto> kafkaTemplate;
	
	private  static final Logger LOGGER= LoggerFactory.getLogger(OrderController.class);
			
	
	@PostMapping(value=AppConstant.PLACE_ORDER)
	public void placeOrder(@RequestBody OrderDto orderDto) {
		LOGGER.info(" inside placeorder () of OrderController dto {} :"+orderDto);
		orderService.placeOrder(orderDto);
	}

}
