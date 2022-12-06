package com.bacen.Project.model.exceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MensaisExceptions {

    @ExceptionHandler({EmptyResultDataAccessException.class, IllegalArgumentException.class})
    public ResponseEntity errorNotFound(Exception ex){
        return ResponseEntity.notFound().build();
    }
}
