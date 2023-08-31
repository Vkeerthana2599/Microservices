package com.keerthi.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthi.orderservice.entity.OrderDetails;

public interface OrderRepository extends JpaRepository<OrderDetails,Long> {

}
