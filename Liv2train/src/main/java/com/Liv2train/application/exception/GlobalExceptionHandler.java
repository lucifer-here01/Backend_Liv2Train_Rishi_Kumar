package com.Liv2train.application.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	// handle  Validation Errors 
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> validationErrorHandling(MethodArgumentNotValidException exception){
		ErrorDetails errordetails = new ErrorDetails(new Date(),"Validation Error",
				exception.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<>(errordetails,HttpStatus.BAD_REQUEST);
		
	}
	
	//handle global Exception 
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globalExceptionHandling(Exception exception, WebRequest request){
		ErrorDetails errordetails = new ErrorDetails(new Date(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(errordetails,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	

	
	
}
