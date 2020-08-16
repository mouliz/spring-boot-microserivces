package com.anblicks.orderitem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anblicks.orderitem.model.OrderItem;
import com.anblicks.orderitem.repo.OrderItemRepository;

@Service 
public class OrderItemService {

	@Autowired
	private OrderItemRepository itemRepository;
	
	
	public List<OrderItem> getOrderItems(){
		
	return itemRepository.findAll();
	}
	
	public OrderItem getOrderItem(long id){
		
		return itemRepository.findById(id).get();
		}
	
	public void saveItem(OrderItem orderItem) {
		itemRepository.save(orderItem);
	}
}
