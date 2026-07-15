package com.b2b.orderandinventory.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
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

    @ExceptionHandler(CategoryAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleCategoryAlreadyExistsException(CategoryAlreadyExistsException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }

    @ExceptionHandler(CompanyDoesNotExistException.class)
    public ResponseEntity<ErrorResponse> handleCompanyDoesNotExistsException(CompanyDoesNotExistException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }

    @ExceptionHandler(OrderDoesNotExistException.class)
    public ResponseEntity<ErrorResponse> handleOrderDoesNotExistsException(OrderDoesNotExistException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }

    @ExceptionHandler(ReferenceNumberDoesNotExistsException.class)
    public ResponseEntity<ErrorResponse> handleReferenceDoesNotExistsException(ReferenceNumberDoesNotExistsException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUserAlreadyExistsException(UserAlreadyExistsException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }

//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException ex, HttpServletRequest request){
//        return ResponseEntity.status(400).body(
//                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
//        );
//    }

    @ExceptionHandler(CategoryDoesNotExistException.class)
    public ResponseEntity<ErrorResponse> handleCategoryDoesNotExistException(CategoryDoesNotExistException ex, HttpServletRequest request){
        return ResponseEntity.status(400).body(
                new ErrorResponse(400, ex.getMessage(), request.getRequestURI())
        );
    }


    @ExceptionHandler(StockItemDoesNotExistsException.class)
    public ResponseEntity<ErrorResponse> handleStockItemDoesNotExistException(StockItemDoesNotExistsException ex, HttpServletRequest request){
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
