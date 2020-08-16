package com.anblicks.orderitem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anblicks.orderitem.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
