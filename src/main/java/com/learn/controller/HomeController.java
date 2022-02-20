package com.learn.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String get(){
        String str = null;
        str.length();
        return "Hello spring";
    }

    @GetMapping("/get")
    public String getId(){
        throw new NumberFormatException();
    }

    @GetMapping("/ex")
    public String exception(){
        throw new ClassCastException();
    }

    @ExceptionHandler(ClassCastException.class)
    public ResponseEntity<String> handleEx(){
        return new ResponseEntity<>("ClassCastException", HttpStatus.BAD_REQUEST);
    }
}
