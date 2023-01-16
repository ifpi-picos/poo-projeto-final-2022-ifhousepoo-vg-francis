package com.example.Entidades;

public class Endereco {

    String rua;
    String bairro;
    int numero;
    String cidade;
    String uf;

    public Endereco(String rua, String bairro, int numero, String cidade, String uf) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
    }
}
