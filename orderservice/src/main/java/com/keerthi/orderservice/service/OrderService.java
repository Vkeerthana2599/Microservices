package com.keerthi.orderservice.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.keerthi.orderservice.dto.EmailDto;
import com.keerthi.orderservice.dto.OrderDto;
import com.keerthi.orderservice.entity.OrderDetails;
import com.keerthi.orderservice.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private KafkaTemplate<String ,EmailDto> kafkaTemplate;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);
	
//	public void placeOrder(OrderDto orderDto) {
//		LOGGER.info("inside placeOrder () of OrderService orderDto {}:"+orderDto);
//		saveOrderDetails(orderDto);
//	}
	
	public void saveOrderDetails(OrderDto orderDto) {
		LOGGER.info("inside saveOrderdetails () of OrderService orderDto {}:"+orderDto);
		Random random =new Random();
		
		long num=random.nextLong(1000);
		OrderDetails orderDetails=new OrderDetails();
		orderDetails.setOrderNumber(null);
		orderDetails.setLineItems(orderDto.getLineItem());
		orderRepository.save(orderDetails);
	}

	public String placeOrder(@RequestBody OrderDto dto) {
		EmailDto emailDto = new EmailDto();
		emailDto.setSubject("inivitaion");
		emailDto.setMailBodyContext("baby Shower");
        emailDto.setReceiptMailId("vkeerthana2599@gamil.com");
        emailDto.setSendMailId("vkeerthana2599@gamil.com");
        
        kafkaTemplate.send("emailTemplate", emailDto);
        return"[{name:ordername}]";
	}
}
