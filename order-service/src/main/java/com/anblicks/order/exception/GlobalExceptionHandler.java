package com.anblicks.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = OrderNotException.class)
	public ResponseEntity<Object> handleOrderNotFountException(OrderNotException orderNotException) {
		return new ResponseEntity<Object>(orderNotException.getMessage(), HttpStatus.NOT_FOUND);
	}
}
