package com.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerFactory {

    public void mudarTela(String nomeTela, ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/telas/" + nomeTela + ".fxml"));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene tela = new Scene(root);
        stage.setScene(tela);
        stage.show();
    }
}
