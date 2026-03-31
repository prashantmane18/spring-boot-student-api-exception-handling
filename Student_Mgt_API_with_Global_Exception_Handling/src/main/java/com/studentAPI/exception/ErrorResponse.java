package com.studentAPI.exception;

import java.time.LocalDate;

public class ErrorResponse 
{
	private LocalDate timestamp;
	private int status;
	private String error;
	private String message;
	
	
	
	public ErrorResponse() {
		
	}
	public ErrorResponse(LocalDate timestamp, int status, String error, String message) 
	{
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
	}
	public LocalDate getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
