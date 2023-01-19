package com.example.Controllers;

import com.example.Dados.AluguelDados;
import com.example.Dados.ImovelDados;
import com.example.Dados.UsuarioDados;
import com.example.Entidades.Aluguel;
import com.example.Entidades.Imovel;
import com.example.Entidades.Usuario;
import com.example.Exceptions.ImovelJaAlugadoException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class AlterarAluguel2Controller extends ControllerFactory {
    @FXML
    DatePicker dataInicioDatePicker;
    @FXML
    DatePicker dataFimDatePicker;
    @FXML
    TextField imovelIdTextField;
    @FXML
    TextField usuarioEmailTextField;

    private Aluguel aluguel;

    public void alterarAluguel(ActionEvent e) throws IOException {
        LocalDate dataInicio = dataInicioDatePicker.getValue();
        LocalDate dataFim = dataFimDatePicker.getValue();
        int imovelId = Integer.parseInt(imovelIdTextField.getText());
        String usuarioEmail = usuarioEmailTextField.getText();
        Imovel imovel = ImovelDados.getImovelById(imovelId);
        Usuario usuario = UsuarioDados.getUsuarioByEmail(usuarioEmail);

        try {
            this.aluguel.setImovel(imovel);
        } catch (ImovelJaAlugadoException err) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setHeaderText("ERRO");
            errorAlert.setContentText(err.getMessage());
            errorAlert.showAndWait();
            return;
        }

        this.aluguel.setDataInicio(dataInicio);
        this.aluguel.setDataFim(dataFim);
        this.aluguel.setUsuario(usuario);
        mudarTela("gerenciarAlugueisImovel", e);
    }

    public void iniciaDadosAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
        dataInicioDatePicker.setValue(aluguel.getDataInicio());
        dataFimDatePicker.setValue(aluguel.getDataFim());
        imovelIdTextField.setText(Integer.toString(aluguel.getImovel().getId()));
        usuarioEmailTextField.setText(aluguel.getUsuario().getEmail());
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarAlugueisImovel", e);
    }
}
