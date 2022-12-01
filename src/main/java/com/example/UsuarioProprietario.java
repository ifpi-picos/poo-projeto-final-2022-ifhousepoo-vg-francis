package com.example;

import java.util.Date;

public class UsuarioProprietario extends Usuario {

    public UsuarioProprietario(String nome, String email, Endereco endereco, Date dataNascimento) {
        super(nome, email, endereco, dataNascimento);
    }
}
