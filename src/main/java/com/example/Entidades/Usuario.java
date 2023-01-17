package com.example.Entidades;

import java.sql.Date;

public class Usuario {
    private Long id_usuario;
    private static String nome;
    private static String email;
    private static String endereco;
    private static Date dataNascimento;

    /**
     * @param id_usuario
     * @param nome
     * @param email
     * @param endereco
     * @param dataNascimento
     */
    public Usuario(Long id_usuario, String nome, String email, String endereco, Date dataNascimento) {
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
    public static String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public static String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public static Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}