package com.example.Entidades;

import java.time.LocalDate;

public class Aluguel {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Imovel imovel;
    private Usuario usuario;

    private int id;

    private static int idAtual = 1;

    public Aluguel(LocalDate dataInicio, LocalDate dataFim, Imovel imovel, Usuario usuario) {
        this.id = idAtual;
        idAtual++;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.imovel = imovel;
        this.usuario = usuario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }
}
