package com.anblicks.order.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anblicks.order.client.OrderItem;
import com.anblicks.order.client.OrderItemClient;
import com.anblicks.order.model.Order;
import com.anblicks.order.service.OrderService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Chandramouli
 *
 */
@RestController
public class OrderController {

	private final OrderService orderService;
	private final OrderItemClient orderItemClient;

	public OrderController(OrderItemClient orderItemClient, OrderService orderService) {
		this.orderItemClient = orderItemClient;
		this.orderService = orderService;
	}

	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getOrders() {

		return new ResponseEntity<>(orderService.getOrders(), HttpStatus.OK);
	}
	

	@GetMapping("/order/{id}")
	public ResponseEntity<Order> getOrders(@PathVariable long id) {

	      
		return new ResponseEntity<>(orderService.getOrder(id), HttpStatus.OK);
	}

	
	@PostMapping("/order")
	public ResponseEntity<Object> saveItems(@Valid @RequestBody  Order order) {

		orderService.saveOrder(order);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	
	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping("/order/items")
	public List<OrderItem> getOrderItems() {
		return orderItemClient.getOrderItems();
	}

	public List<OrderItem> fallback() {
		return new ArrayList<OrderItem>();
	}

}
