package com.example.Controllers;

import com.example.Dados.AluguelDados;
import com.example.Entidades.Aluguel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RemoverAluguelController extends ControllerFactory {
    @FXML
    TextField idTextField;

    public void removerAluguel(ActionEvent e) throws IOException {
        try {
            int id = Integer.parseInt(idTextField.getText());
            Aluguel aluguel = AluguelDados.getAluguelById(id);

            if (aluguel != null) {
                AluguelDados.removeAluguel(aluguel);
                mudarTela("gerenciarAlugueisImovel", e);
            }
        } catch (NumberFormatException ignored) {
        }
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarAlugueisImovel", e);
    }
}
