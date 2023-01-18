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

public class AlterarUsuario2Controller extends ControllerFactory {
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

    Usuario usuario;

    public void alterarUsuario(ActionEvent e) throws IOException {
        String nome = nomeTextField.getText();
        String email = emailTextField.getText();
        LocalDate dataNascimento = dataNascimentoDatePicker.getValue();
        String rua = ruaTextField.getText();
        String bairro = bairroTextField.getText();
        int numero = Integer.parseInt(numeroTextField.getText());
        String cidade = cidadeTextField.getText();
        String uf = ufTextField.getText();

        this.usuario.setNome(nome);
        this.usuario.setEmail(email);
        this.usuario.setDataNascimento(dataNascimento);
        this.usuario.setEndereco(new Endereco(rua, bairro, numero, cidade, uf));

        mudarTela("gerenciarUsuarios", e);
    }

    public void iniciaDadosUsuario(Usuario usuario) {
        this.usuario = usuario;
        nomeTextField.setText(usuario.getNome());
        emailTextField.setText(usuario.getEmail());
        dataNascimentoDatePicker.setValue(usuario.getDataNascimento());

        Endereco enderecoUsuario = usuario.getEndereco();

        ruaTextField.setText(enderecoUsuario.getRua());
        bairroTextField.setText(enderecoUsuario.getBairro());
        numeroTextField.setText(Integer.toString(enderecoUsuario.getNumero()));
        cidadeTextField.setText(enderecoUsuario.getCidade());
        ufTextField.setText(enderecoUsuario.getUf());
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("alterarUsuario", e);
    }
}
