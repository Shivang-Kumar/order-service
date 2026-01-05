package com.practice.microservices.order_Service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.microservices.order_Service.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
