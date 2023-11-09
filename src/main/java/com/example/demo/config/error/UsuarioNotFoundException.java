package com.example.demo.config.error;

import com.example.demo.modelo.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.io.Serial;

public class UsuarioNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 43876691117560211L;

    public UsuarioNotFoundException(Long id){
        super("Usuario not found with id " + id);
    }
}
