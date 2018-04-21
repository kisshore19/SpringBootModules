package com.java.kishore.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class PostNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 2847695802594000718L;

	public PostNotFoundException(String exp) {
		super(exp);
	}
}
