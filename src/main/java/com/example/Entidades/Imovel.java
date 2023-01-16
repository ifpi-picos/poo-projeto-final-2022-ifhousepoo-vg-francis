package com.example.Entidades;

import java.time.LocalDate;

public class Imovel {
    private String descricao;
    private double valorAluguel;
    private Endereco endereco;
    private LocalDate dataCadastro;

    public Imovel(String descricao, double valorAluguel, Endereco endereco, LocalDate dataCadastro) {
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
