package com.kbbukopin.cif.referrence.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(value = {NotFoundException.class})
	protected ResponseEntity<Object> handleConflict(NotFoundException ex, WebRequest request){
		return handleExceptionInternal(ex, new ErrorMessageCustome(ex.getMessage()), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}
}
