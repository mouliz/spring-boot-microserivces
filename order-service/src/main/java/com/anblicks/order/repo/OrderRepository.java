package com.anblicks.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anblicks.order.model.Order;

/**
 * @author Chandramouli
 *
 */

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
