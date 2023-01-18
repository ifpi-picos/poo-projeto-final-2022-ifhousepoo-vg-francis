package com.example.Controllers;

import com.example.Dados.UsuarioDados;
import com.example.Entidades.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AlterarUsuarioController extends ControllerFactory {
    @FXML
    TextField emailTextField;

    public void alterarUsuario(ActionEvent e) throws IOException {
        String email = emailTextField.getText();
        Usuario usuario = UsuarioDados.getUsuarioByEmail(email);

        if (usuario != null) {
            sendData(e, usuario);
        }
    }

    private void sendData(ActionEvent e, Usuario usuario) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/telas/alterarUsuario2.fxml"));
        Parent root = loader.load();
        AlterarUsuario2Controller alterarUsuario2Controller = loader.getController();
        alterarUsuario2Controller.iniciaDadosUsuario(usuario);

        Stage stage = (Stage)((Node) e.getSource()).getScene().getWindow();
        Scene tela = new Scene(root);
        stage.setScene(tela);
        stage.show();
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarUsuarios", e);
    }
}
