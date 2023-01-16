package com.example.Controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class GerenciarImoveisController extends ControllerFactory {
    public void verImoveis(ActionEvent e) {
        System.out.println("Ver imóveis...");
    }

    public void adicionarImovel(ActionEvent e) throws IOException {
        mudarTela("adicionarImovel", e);
    }

    public void removerImovel(ActionEvent e) {
        System.out.println("Remover imovel...");
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("inicio", e);
    }
}
