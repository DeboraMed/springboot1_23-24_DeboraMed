package com.example.demo.config.error;

import java.io.Serial;

public class ProductoNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 4124675284469531845L;

    public ProductoNotFoundException(Long id){
        super("Producto not found with id " + id);
    }
}
