package com.example.Controllers;

import com.example.Dados.ImovelDados;
import com.example.Entidades.Endereco;
import com.example.Entidades.Imovel;
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

public class VerImoveisController extends ControllerFactory implements Initializable {

    @FXML
    private TableColumn<Imovel, LocalDate> dataCadastro;

    @FXML
    private TableColumn<Imovel, String> valorAluguel;

    @FXML
    private TableColumn<Imovel, Endereco> endereco;

    @FXML
    private TableColumn<Imovel, String> descricao;

    @FXML
    private TableColumn<Imovel, Integer> id;

    @FXML
    private TableView<Imovel> tabela;

    ObservableList<Imovel> imoveis = FXCollections.observableArrayList(ImovelDados.getImoveis());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        descricao.setCellValueFactory(new PropertyValueFactory<Imovel, String>("descricao"));
        id.setCellValueFactory(new PropertyValueFactory<Imovel, Integer>("id"));
        valorAluguel.setCellValueFactory(new PropertyValueFactory<Imovel, String>("valorAluguel"));
        dataCadastro.setCellValueFactory(new PropertyValueFactory<Imovel, LocalDate>("dataCadastro"));
        endereco.setCellValueFactory(new PropertyValueFactory<Imovel, Endereco>("endereco"));
        tabela.setItems(imoveis);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarImoveis", e);
    }

}
