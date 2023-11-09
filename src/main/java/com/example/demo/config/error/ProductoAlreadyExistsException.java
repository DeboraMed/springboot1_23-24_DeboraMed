package com.example.demo.config.error;

import java.io.Serial;

public class ProductoAlreadyExistsException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -751578436319386531L;

    public ProductoAlreadyExistsException(String name){
        super("Producto already exists with name " + name);
    }
}
