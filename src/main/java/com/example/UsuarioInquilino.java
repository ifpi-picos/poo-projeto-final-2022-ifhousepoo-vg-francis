package com.example;

import java.sql.Date;

public class UsuarioInquilino extends Usuario {

    public UsuarioInquilino(String nome, String email, Endereco endereco, Date dataNascimento) {
        super(nome, email, endereco, dataNascimento);
    }
}
