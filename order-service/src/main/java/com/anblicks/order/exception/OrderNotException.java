package com.anblicks.order.exception;



public class OrderNotException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OrderNotException(String message) {
		super(message);
	}
}
