package com.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioController extends ControllerFactory {
    public void gerenciarUsuarios(ActionEvent e) throws IOException {
        mudarTela("gerenciarUsuarios", e);
    }

    public void gerenciarImoveis(ActionEvent e) throws IOException {
        mudarTela("gerenciarImoveis", e);
    }
}
