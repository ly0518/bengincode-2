package org.web.exception;

public class BeginCodeException extends RuntimeException {

	public BeginCodeException(){
		super();
	}
	
	public BeginCodeException(String message){
        super(message);
	}
}
