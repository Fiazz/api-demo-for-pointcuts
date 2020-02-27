package com.example.aop.exception.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.aop.exception.DemoException;

@RestControllerAdvice
public class DemoExceptionHandler {
	@ExceptionHandler(value = DemoException.class)
	public ResponseEntity<Object> exception(DemoException exception) {
		return ResponseEntity.badRequest().build();
	}

}
