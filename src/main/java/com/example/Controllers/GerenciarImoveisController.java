package com.example.Controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class GerenciarImoveisController extends ControllerFactory {
    public void verImoveis(ActionEvent e) throws IOException {
        mudarTela("verImoveis", e);
    }

    public void alterarImovel(ActionEvent e) throws IOException {
        mudarTela("alterarImovel", e);
    }

    public void adicionarImovel(ActionEvent e) throws IOException {
        mudarTela("adicionarImovel", e);
    }

    public void removerImovel(ActionEvent e) throws IOException {
        mudarTela("removerImovel", e);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("inicio", e);
    }
}
