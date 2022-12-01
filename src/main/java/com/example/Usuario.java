package com.example;

import java.util.Date;

public abstract class Usuario {
    private String nome;
    private String email;
    private Endereco endereco;
    private Date dataNascimento;

    public Usuario(String nome, String email, Endereco endereco, Date dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDataNasciemento() {
        return dataNascimento;
    }

    public void setDataNasciemento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
