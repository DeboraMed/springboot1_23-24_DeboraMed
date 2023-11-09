package com.example.demo.config.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UsuarioNotFoundException.class)
    public ResponseEntity<Object> handleUsuarioNotFoundException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ProductoNotFoundException.class)
    public ResponseEntity<Object> handleProductoNotFoundException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ProductoAlreadyExistsException.class)
    public ResponseEntity<Object> handleProductoAlreadyExistsException(Exception ex) {
        // Elegimos 409 CONFLICT para cuando el producto ya existe. ¿Hay algún código más apropiado?
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}