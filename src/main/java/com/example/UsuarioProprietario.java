package com.example;

import java.sql.Date;

public class UsuarioProprietario extends Usuario {

    public UsuarioProprietario(String nome, String email, Endereco endereco, Date dataNascimento) {
        super(nome, email, endereco, dataNascimento);
    }
}
