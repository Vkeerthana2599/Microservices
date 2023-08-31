package com.keerthi.orderservice.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.keerthi.orderservice.appconstant.AppConstant;

import lombok.Data;
@Table(name=AppConstant.ORDER_DETAILS)
@Data
@Entity
public class OrderDetails implements Serializable {
	@GenericGenerator(name="auto" , strategy="increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="order_number")
	private Long orderNumber;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="order_details")
	private List<OrderLineItems> lineItems;

}
