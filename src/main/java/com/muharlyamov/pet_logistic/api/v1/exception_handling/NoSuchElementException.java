package com.muharlyamov.pet_logistic.api.v1.exception_handling;

public class NoSuchElementException extends RuntimeException{

    public NoSuchElementException(String message) {
        super(message);
    }
}
