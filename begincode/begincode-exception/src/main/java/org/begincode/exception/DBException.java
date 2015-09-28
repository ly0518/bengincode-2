package org.begincode.exception;

public class DBException extends RuntimeException {

	public DBException(){
		super();
	}
	
	public DBException(String message){
        super(message);
	}
	public DBException(Exception e , String message){
		super(message,e);
	}
}
