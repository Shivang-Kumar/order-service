package com.practice.microservices.order_Service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.practice.microservices.order_Service.dto.OrderRequest;
import com.practice.microservices.order_Service.model.Order;
import com.practice.microservices.order_Service.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {
	
	private final OrderRepository orderRepository;
	
	
	public void placeOrder(OrderRequest orderRequest) {
		//map order request to order object 
		Order order=new Order();
		order.setOrderNumber(UUID.randomUUID().toString());
		order.setPrice(orderRequest.price());
		order.setOrderNumber(orderRequest.orderNumber());
		order.setQuantity(orderRequest.quantity());
		order.setSkuCode(orderRequest.skuCode());
		//save order to order repository
		orderRepository.save(order);
		
	}

}
