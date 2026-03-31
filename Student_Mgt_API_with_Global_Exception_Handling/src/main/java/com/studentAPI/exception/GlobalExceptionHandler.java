package com.studentAPI.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler 
{
	@ExceptionHandler(StudentNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleStudentNotFoundException(StudentNotFoundException ex)
	{
		ErrorResponse error = new ErrorResponse();
		error.setTimestamp(LocalDate.now());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setError("NOT FOUND");
		error.setMessage(ex.getMessage());
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
}
