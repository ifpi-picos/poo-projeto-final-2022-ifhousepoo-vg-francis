package com.example.Controllers;

import com.example.Entidades.Endereco;
import com.example.Entidades.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

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
        Usuario usuario = new Usuario(null, nome, email, endereco, dataNascimento);

        System.out.println(nome);
        System.out.println(email);
        System.out.println(dataNascimento);
        System.out.println(rua);
        System.out.println(bairro);
        System.out.println(numero);
        System.out.println(cidade);
        System.out.println(uf);

        // TODO: adicionar usuario ao banco de dados

        mudarTela("gerenciarUsuarios", e);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarUsuarios", e);
    }
}
