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

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getUf() {
        return uf;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }

    
}

