package com.example.demo.config.error;

import com.example.demo.modelo.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNotFoundException extends RuntimeException{
    private  static final long serialVersionUID = 43876691117560211L;

    public UsuarioNotFoundException(Long id){
        super("No se ha encontrado el usuario con id:"+id);
    }
}
