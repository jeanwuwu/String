//package com.test;

public class StringTooLongException extends Exception {

    public StringTooLongException() {
    }

	public StringTooLongException(String msg){
		super(msg);
	}
}