package com.sunbeam.exceptionhandling;

public class ExceptionLineTooLong extends Exception {
	
	private String message;

	public ExceptionLineTooLong(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public void printStackTrace() {
		System.err.println("ExceptionLineTooLong:" + message);
	}

}
