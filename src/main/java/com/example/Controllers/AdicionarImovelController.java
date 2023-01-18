package com.example.Controllers;

import com.example.Dados.ImovelDados;
import com.example.Entidades.Endereco;
import com.example.Entidades.Imovel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class AdicionarImovelController extends ControllerFactory {
    @FXML
    TextField descricaoTextField;
    @FXML
    TextField valorAluguelTextField;
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

    public void adicionarImovel(ActionEvent e) throws IOException {
        String descricao = descricaoTextField.getText();
        int valorAluguel = Integer.parseInt(valorAluguelTextField.getText());
        String rua = ruaTextField.getText();
        String bairro = bairroTextField.getText();
        int numero = Integer.parseInt(numeroTextField.getText());
        String cidade = cidadeTextField.getText();
        String uf = ufTextField.getText();
        Endereco endereco = new Endereco(rua, bairro, numero, cidade, uf);
        Imovel imovel = new Imovel(descricao, valorAluguel, endereco, LocalDate.now());

        ImovelDados.adicionaImovel(imovel);
        for (Imovel im : ImovelDados.getImoveis()) {
            System.out.println(im.getDescricao());
        }

        mudarTela("gerenciarImoveis", e);
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("gerenciarImoveis", e);
    }
}
