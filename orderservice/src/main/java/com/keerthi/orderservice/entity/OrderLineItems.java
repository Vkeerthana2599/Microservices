package com.keerthi.orderservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.keerthi.orderservice.appconstant.AppConstant;

import lombok.Data;
@Data
@Table(name=AppConstant.ORDER_LINE_DETAILS)
@Entity
public class OrderLineItems implements Serializable {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private Long id;
	
	@Column(name="stack_code")
	private Long stackCode;
	
	@Column(name="quantity")
	private Long quantity;
	
	@Column(name="price")
	private Long price;

}
