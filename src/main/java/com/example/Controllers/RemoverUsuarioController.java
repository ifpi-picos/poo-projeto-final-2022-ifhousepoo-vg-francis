package com.example.Controllers;

import com.example.Dados.UsuarioDados;
import com.example.Entidades.Endereco;
import com.example.Entidades.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class RemoverUsuarioController extends ControllerFactory {
    @FXML
    TextField emailTextField;

    public void removerUsuario(ActionEvent e) throws IOException {
        String email = emailTextField.getText();
        Usuario usuario = UsuarioDados.getUsuarioByEmail(email);

        if (usuario != null) {
            UsuarioDados.removeUsuario(usuario);
            mudarTela("gerenciarUsuarios", e);
        }
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarUsuarios", e);
    }
}
