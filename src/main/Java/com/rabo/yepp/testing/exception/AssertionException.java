package com.rabo.yepp.testing.exception;

public class AssertionException extends RuntimeException{

    public AssertionException(){
        super();
    }
    public AssertionException( String message){
        super( message);
    }
}
