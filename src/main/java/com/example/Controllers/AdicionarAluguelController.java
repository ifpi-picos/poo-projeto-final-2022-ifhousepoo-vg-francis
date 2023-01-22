package com.example.Controllers;

import com.example.Dados.AluguelDados;
import com.example.Dados.ImovelDados;
import com.example.Dados.UsuarioDados;
import com.example.Entidades.Aluguel;
import com.example.Entidades.Endereco;
import com.example.Entidades.Imovel;
import com.example.Entidades.Usuario;
import com.example.Exceptions.ImovelJaAlugadoException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class AdicionarAluguelController extends ControllerFactory {
    @FXML
    DatePicker dataInicioDatePicker;
    @FXML
    DatePicker dataFimDatePicker;
    @FXML
    TextField imovelIdTextField;
    @FXML
    TextField usuarioEmailTextField;

    public void adicionarAluguel(ActionEvent e) throws IOException {
        LocalDate dataInicio = dataInicioDatePicker.getValue();
        LocalDate dataFim = dataFimDatePicker.getValue();
        int imovelId = Integer.parseInt(imovelIdTextField.getText());
        String email = usuarioEmailTextField.getText();
        Usuario usuario = UsuarioDados.getUsuarioByEmail(email);
        Imovel imovel = ImovelDados.getImovelById(imovelId);
        Aluguel aluguel = null;

        try {
            aluguel = new Aluguel(dataInicio, dataFim, imovel, usuario);
        } catch (ImovelJaAlugadoException err) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("ERRO");
            errorAlert.setContentText(err.getMessage());
            errorAlert.showAndWait();
            return;
        }

        AluguelDados.adicionaAluguel(aluguel);

        mudarTela("gerenciarAlugueisImovel", e);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarAlugueisImovel", e);
    }
}
