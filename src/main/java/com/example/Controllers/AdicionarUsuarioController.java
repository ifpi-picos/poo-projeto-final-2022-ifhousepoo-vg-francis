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
import java.util.List;

public class AdicionarUsuarioController extends ControllerFactory {
    @FXML
    TextField nomeTextField;
    @FXML
    TextField emailTextField;
    @FXML
    DatePicker dataNascimentoDatePicker;
    @FXML
    TextField ruaTextField;
    @FXML
    TextField bairroTextField;
    @FXML
    TextField numeroTextField;
    @FXML
    TextField cidadeTextField;
    @FXML
    TextField ufTextField;

    public void adicionarUsuario(ActionEvent e) throws IOException {
        String nome = nomeTextField.getText();
        String email = emailTextField.getText();
        LocalDate dataNascimento = dataNascimentoDatePicker.getValue();
        String rua = ruaTextField.getText();
        String bairro = bairroTextField.getText();
        int numero = Integer.parseInt(numeroTextField.getText());
        String cidade = cidadeTextField.getText();
        String uf = ufTextField.getText();
        Endereco endereco = new Endereco(rua, bairro, numero, cidade, uf);
        Usuario usuario = new Usuario(nome, email, endereco, dataNascimento);
        UsuarioDados.adicionaUsuario(usuario);

        mudarTela("gerenciarUsuarios", e);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarUsuarios", e);
    }
}
