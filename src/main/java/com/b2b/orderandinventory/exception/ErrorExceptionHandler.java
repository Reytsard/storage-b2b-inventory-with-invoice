package com.b2b.orderandinventory.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFound(UserNotFoundException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }

    @ExceptionHandler(CompanyAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleCompanyAlreadyExists(CompanyAlreadyExistsException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }
}
