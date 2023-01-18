package com.example.Entidades;
import java.time.LocalDate;

public class Imovel {
    private String descricao;
    private double valorAluguel;
    private Endereco endereco;
    private LocalDate dataCadastro;

    private double id;

    private static double idAtual = 1;

    public Imovel(String descricao, double valorAluguel, Endereco endereco, LocalDate dataCadastro) {
        this.id = idAtual;
        idAtual++;
        this.descricao = descricao;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.dataCadastro = dataCadastro;
    }

    public double getId() {
        return id;
    }

    public static double getIdAtual() {
        return idAtual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }


    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public static void add(Imovel imovel) {
    }
}
