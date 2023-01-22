package com.example.Controllers;

import javafx.event.ActionEvent;

import java.io.IOException;

public class GerenciarUsuariosController extends ControllerFactory {
    public void verUsuarios(ActionEvent e) throws IOException {
        mudarTela("verUsuarios", e);
    }

    public void alterarUsuario(ActionEvent e) throws IOException {
        mudarTela("alterarUsuario", e);
    }

    public void adicionarUsuario(ActionEvent e) throws IOException {
        mudarTela("adicionarUsuario", e);
    }

    public void removerUsuario(ActionEvent e) throws IOException {
        mudarTela("removerUsuario", e);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("inicio", e);
    }
}
