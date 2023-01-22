package com.example.Controllers;

import com.example.Dados.AluguelDados;
import com.example.Entidades.Aluguel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AlterarAluguelController extends ControllerFactory {
    @FXML
    TextField idTextField;

    public void alterarAluguel(ActionEvent e) throws IOException {
        try {
            int id = Integer.parseInt(idTextField.getText());
            Aluguel aluguel = AluguelDados.getAluguelById(id);

            if (aluguel != null) {
                sendData(e, aluguel);
            }
        } catch (NumberFormatException ignored) {
        }
    }

    private void sendData(ActionEvent e, Aluguel aluguel) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/telas/alterarAluguel2.fxml"));
        Parent root = loader.load();
        AlterarAluguel2Controller alterarAluguel2Controller = loader.getController();
        alterarAluguel2Controller.iniciaDadosAluguel(aluguel);

        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene tela = new Scene(root);
        stage.setScene(tela);
        stage.show();
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarAlugueisImovel", e);
    }
}
