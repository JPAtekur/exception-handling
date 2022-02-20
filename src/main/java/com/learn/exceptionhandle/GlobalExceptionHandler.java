package com.learn.exceptionhandle;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler(NullPointerException.class)
    public String handle(){
        return "Exception handled";
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> numberFormatExHandle(){
        return new ResponseEntity<String>("NumberFormatException", HttpStatus.BAD_REQUEST);
    }

}
