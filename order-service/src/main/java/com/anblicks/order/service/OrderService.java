package com.anblicks.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anblicks.order.exception.OrderNotException;
import com.anblicks.order.model.Order;
import com.anblicks.order.repo.OrderRepository;

/**
 * @author Chandramouli
 *
 */

@Service
public class OrderService {

	
	@Autowired
	private OrderRepository orderRepository;
	
	
	public List<Order> getOrders(){
		
	return orderRepository.findAll();
	}
	
	public Order getOrder(long id){
		Optional<Order> order = orderRepository.findById(id);
		if(order.isPresent())
			return order.get();
		else
			throw new OrderNotException("Order Not Found!");
		
	}
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}
}
