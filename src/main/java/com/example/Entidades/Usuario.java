package com.example.Entidades;


import java.time.LocalDate;

public class Usuario {
    private static String nome;
    private static String email;
    private static Endereco endereco;
    private static LocalDate dataNascimento;

    /**
     * @param nome
     * @param email
     * @param endereco
     * @param dataNascimento
     */
    public Usuario(String nome, String email, Endereco endereco, LocalDate dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
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
    public static Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}