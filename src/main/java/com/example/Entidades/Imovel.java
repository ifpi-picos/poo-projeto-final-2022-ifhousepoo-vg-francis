package com.example.Entidades;

import java.util.Date;

public class Imovel {
    private String descricao;
    private double valorAluguel;
    private String endereco;
    private Date dataCadastro;

    public Imovel(String descricao, double valorAluguel, String endereco, Date dataCadastro) {
        this.descricao = descricao;
        this.valorAluguel = valorAluguel;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public static void add(Imovel imovel) {
    }
}
