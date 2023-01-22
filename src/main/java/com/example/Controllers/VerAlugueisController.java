package com.example.Controllers;

import com.example.Dados.AluguelDados;
import com.example.Dados.ImovelDados;
import com.example.Entidades.Endereco;
import com.example.Entidades.Aluguel;
import com.example.Entidades.Imovel;
import com.example.Entidades.Usuario;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableIntegerValue;
import javafx.beans.value.ObservableValue;
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

public class VerAlugueisController extends ControllerFactory implements Initializable {

    @FXML
    private TableColumn<Aluguel, Integer> id;
    @FXML
    private TableColumn<Aluguel, LocalDate> dataInicio;
    @FXML
    private TableColumn<Aluguel, LocalDate> dataFim;
    @FXML
    private TableColumn<Aluguel, Integer> imovelId;
    @FXML
    private TableColumn<Aluguel, String> usuarioEmail;
    @FXML
    private TableView<Aluguel> tabela;

    ObservableList<Aluguel> alugueis = FXCollections.observableArrayList(AluguelDados.getAlugueis());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<Aluguel, Integer>("id"));
        dataInicio.setCellValueFactory(new PropertyValueFactory<Aluguel, LocalDate>("dataInicio"));
        dataFim.setCellValueFactory(new PropertyValueFactory<Aluguel, LocalDate>("dataFim"));

//        imovelId.setCellValueFactory(new PropertyValueFactory<Imovel, Integer>("id"));
//        usuarioEmail.setCellValueFactory(new PropertyValueFactory<Usuario, String>("email"));
        imovelId.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getImovel().getId()).asObject());
        usuarioEmail.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getUsuario().getEmail()));

        tabela.setItems(alugueis);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarAlugueisImovel", e);
    }

}
