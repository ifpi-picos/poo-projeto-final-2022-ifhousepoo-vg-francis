package com.example.Entidades;

import java.time.LocalDate;

public class Usuario {
    private Long id_usuario;
    private String nome;
    private String email;
    private Endereco endereco;
    private LocalDate dataNascimento;

    /**
     * @param id_usuario
     * @param nome
     * @param email
     * @param endereco
     * @param dataNascimento
     */
    public Usuario(Long id_usuario, String nome, String email, Endereco endereco, LocalDate dataNascimento) {
        this.id_usuario = id_usuario;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    public long getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(Long id_usuario) {
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
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}