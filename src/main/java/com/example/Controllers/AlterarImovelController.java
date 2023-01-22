package com.example.Controllers;

import com.example.Dados.ImovelDados;
import com.example.Entidades.Imovel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AlterarImovelController extends ControllerFactory {
    @FXML
    TextField idTextField;

    public void alterarImovel(ActionEvent e) throws IOException {
        try {
            int id = Integer.parseInt(idTextField.getText());
            Imovel imovel = ImovelDados.getImovelById(id);

            if (imovel != null) {
                sendData(e, imovel);
            }
        } catch (NumberFormatException ignored) {
        }
    }

    private void sendData(ActionEvent e, Imovel imovel) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/telas/alterarImovel2.fxml"));
        Parent root = loader.load();
        AlterarImovel2Controller alterarImovel2Controller = loader.getController();
        alterarImovel2Controller.iniciaDadosImovel(imovel);

        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene tela = new Scene(root);
        stage.setScene(tela);
        stage.show();
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarImoveis", e);
    }
}
