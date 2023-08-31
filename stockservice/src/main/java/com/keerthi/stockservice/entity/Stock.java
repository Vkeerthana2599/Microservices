package com.keerthi.stockservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.keerthi.stockservice.appconstant.AppConstant;

import lombok.Data;

@Entity
@Table(name=AppConstant.STOCK_DETAILS)
@Data
public class Stock {
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="stock_id")
	private Long stockId;
	
	@Column(name="stock_number")
	private Long stockNumber;

}
