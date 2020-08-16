package com.anblicks.order.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Chandramouli
 *
 */

@FeignClient("order-item-service")
public interface OrderItemClient {

	@GetMapping("/items")
	List<OrderItem> getOrderItems();
}
