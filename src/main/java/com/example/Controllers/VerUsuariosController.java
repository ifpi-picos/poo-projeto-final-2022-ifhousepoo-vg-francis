package com.example.Controllers;

import com.example.Dados.UsuarioDados;
import com.example.Entidades.Endereco;
import com.example.Entidades.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class VerUsuariosController extends ControllerFactory implements Initializable {

    @FXML
    private TableColumn<Usuario, LocalDate> dataNascimento;

    @FXML
    private TableColumn<Usuario, String> email;

    @FXML
    private TableColumn<Usuario, Endereco> endereco;

    @FXML
    private TableColumn<Usuario, String> nome;

    @FXML
    private TableView<Usuario> tabela;

    ObservableList<Usuario> usuarios = FXCollections.observableArrayList(UsuarioDados.getUsuarios());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nome.setCellValueFactory(new PropertyValueFactory<Usuario, String>("nome"));
        email.setCellValueFactory(new PropertyValueFactory<Usuario, String>("email"));
        dataNascimento.setCellValueFactory(new PropertyValueFactory<Usuario, LocalDate>("dataNascimento"));
        endereco.setCellValueFactory(new PropertyValueFactory<Usuario, Endereco>("endereco"));
        tabela.setItems(usuarios);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarUsuarios", e);
    }

}
