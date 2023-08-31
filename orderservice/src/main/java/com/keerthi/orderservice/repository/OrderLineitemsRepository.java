package com.keerthi.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthi.orderservice.entity.OrderLineItems;

public interface OrderLineitemsRepository extends JpaRepository<OrderLineItems, Long>{

}
