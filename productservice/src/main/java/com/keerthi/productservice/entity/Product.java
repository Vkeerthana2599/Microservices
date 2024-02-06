package com.keerthi.productservice.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.keerthi.productservice.constant.AppConstant;

import lombok.Data;

@Entity
@Table(name=AppConstant.PRODUCT_DETAILS)
@Data
public class Product implements Serializable {
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator = "auto")
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "name1")
	private String name1;
	
	@Column(name = "description")
	private String description;
	
	@Column(name="price")
	private Double price;

}
