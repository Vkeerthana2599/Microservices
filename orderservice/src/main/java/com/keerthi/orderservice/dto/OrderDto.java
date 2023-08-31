package com.keerthi.orderservice.dto;

import java.io.Serializable;
import java.util.List;

import com.keerthi.orderservice.entity.OrderLineItems;

import lombok.Data;

@Data
public class OrderDto implements Serializable {
	
	private List<OrderLineItems> lineItem;

}
