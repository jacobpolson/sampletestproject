package com.application.productsale.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseBody
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ErrorResponseController {
	
	@ExceptionHandler
	public ErrorResponse handleinvalidRequestException(CommonException se) {
		ErrorResponse response = new ErrorResponse(se.getStatus(),se.getMessage());
        return response;
    }

}
