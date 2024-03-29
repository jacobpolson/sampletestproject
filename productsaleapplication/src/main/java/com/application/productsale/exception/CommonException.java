package com.application.productsale.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class CommonException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus status;
	private String message;
	
	public CommonException(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

}
