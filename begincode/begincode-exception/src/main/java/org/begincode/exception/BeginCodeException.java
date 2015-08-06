package org.begincode.exception;

public class BeginCodeException extends RuntimeException {

	public BeginCodeException(){
		super();
	}
	
	public BeginCodeException(String message){
        super(message);
	}
	public BeginCodeException(Exception e , String message){
		super(message,e);
	}
}
