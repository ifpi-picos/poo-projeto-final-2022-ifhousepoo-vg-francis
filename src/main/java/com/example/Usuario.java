package com.example;

import java.sql.Date;

public abstract class Usuario {
    private String nome;
    private String email;
    private Endereco endereco;
    private Date dataNasciemento;

    public Usuario(String nome, String email, Endereco endereco, Date dataNasciemento) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNasciemento = dataNasciemento;
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
        return dataNasciemento;
    }

    public void setDataNasciemento(Date dataNasciemento) {
        this.dataNasciemento = dataNasciemento;
    }
}
