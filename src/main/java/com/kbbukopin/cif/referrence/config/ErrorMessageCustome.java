package com.kbbukopin.cif.referrence.config;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessageCustome implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HttpStatus httpStatus;
	private String message;
	
	public ErrorMessageCustome(String message) {
		super();
		this.message = message;
		this.httpStatus = HttpStatus.NOT_FOUND;
	}

}
