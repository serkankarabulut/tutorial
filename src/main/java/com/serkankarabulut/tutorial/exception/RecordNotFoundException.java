package com.serkankarabulut.tutorial.exception;

public class RecordNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -3164097527651387550L;

	public RecordNotFoundException(String msg){
        super(msg);
    }
}
