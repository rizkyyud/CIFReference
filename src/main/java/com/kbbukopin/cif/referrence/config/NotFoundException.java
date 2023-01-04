package com.kbbukopin.cif.referrence.config;

import java.text.MessageFormat;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String message = "Data with id {0} Not Found / Data dengan id {0} Tidak ditemukan";
	
	public NotFoundException(Object data) {
		super(MessageFormat.format(message, data));
	}
}
