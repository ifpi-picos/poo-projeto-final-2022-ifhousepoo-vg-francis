package com.example.Controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class GerenciarAlugueisImovelController extends ControllerFactory {
    public void verAlugueis(ActionEvent e) throws IOException {
        mudarTela("verAlugueis", e);
    }

    public void alterarAluguel(ActionEvent e) throws IOException {
        mudarTela("alterarAluguel", e);
    }

    public void adicionarAluguel(ActionEvent e) throws IOException {
        mudarTela("adicionarAluguel", e);
    }

    public void removerAluguel(ActionEvent e) throws IOException {
        mudarTela("removerAluguel", e);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("inicio", e);
    }
}
