package org.example.exception;

public class BadException extends RuntimeException{
    public BadException(String msg){
        super(msg);
    }
}
