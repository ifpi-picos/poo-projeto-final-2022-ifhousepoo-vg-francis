package com.example.Controllers;

import com.example.Dados.ImovelDados;
import com.example.Entidades.Imovel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RemoverImovelController extends ControllerFactory {
    @FXML
    TextField idTextField;

    public void removerImovel(ActionEvent e) throws IOException {
        try {
            int id = Integer.parseInt(idTextField.getText());
            Imovel imovel = ImovelDados.getImovelById(id);

            if (imovel != null) {
                ImovelDados.removeImovel(imovel);
                mudarTela("gerenciarImoveis", e);
            }
        } catch (NumberFormatException ignored) {
        }
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarImoveis", e);
    }
}
