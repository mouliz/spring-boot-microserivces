package com.anblicks.orderitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.anblicks.orderitem.model.OrderItem;
import com.anblicks.orderitem.service.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;
	
	@GetMapping("/items")
	public ResponseEntity<List<OrderItem>> getOrderItems(){
		
		return new ResponseEntity<>(orderItemService.getOrderItems(), HttpStatus.OK);
	}
	
	@GetMapping("/item/{id}")
	public ResponseEntity<OrderItem> getOrderItem(@PathVariable long id){
		
		return new ResponseEntity<>(orderItemService.getOrderItem(id), HttpStatus.OK);
	}
	
	@PostMapping("/item")
	public ResponseEntity<Object> saveItems(@RequestBody OrderItem orderItem){
		
		orderItemService.saveItem(orderItem);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
}
