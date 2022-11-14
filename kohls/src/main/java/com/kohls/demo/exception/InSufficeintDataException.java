package com.kohls.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InSufficeintDataException extends Exception{
    public InSufficeintDataException(String message) {super(message);}
}
