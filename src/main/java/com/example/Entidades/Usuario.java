package com.example.Entidades;

import java.util.Date;

public class Usuario {
    private long id_usuario;
    private String nome;
    private String email;
    private String endereco;
    private Date dataNascimento;

    public Usuario(long id_usuario, String nome, String email, String endereco, Date dataNascimento) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public long getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}