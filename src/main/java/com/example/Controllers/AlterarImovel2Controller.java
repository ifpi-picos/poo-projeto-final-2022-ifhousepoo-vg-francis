package com.example.Controllers;

import com.example.Entidades.Endereco;
import com.example.Entidades.Imovel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AlterarImovel2Controller extends ControllerFactory {
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

    Imovel imovel;

    public void alterarImovel(ActionEvent e) throws IOException {
        String descricao = descricaoTextField.getText();
        double valorAluguel = Double.parseDouble(valorAluguelTextField.getText());
        String rua = ruaTextField.getText();
        String bairro = bairroTextField.getText();
        int numero = Integer.parseInt(numeroTextField.getText());
        String cidade = cidadeTextField.getText();
        String uf = ufTextField.getText();

        this.imovel.setDescricao(descricao);
        this.imovel.setValorAluguel(valorAluguel);
        this.imovel.setEndereco(new Endereco(rua, bairro, numero, cidade, uf));

        mudarTela("gerenciarImoveis", e);
    }

    public void iniciaDadosImovel(Imovel imovel) {
        this.imovel = imovel;
        descricaoTextField.setText(imovel.getDescricao());
        valorAluguelTextField.setText(Double.toString(imovel.getValorAluguel()));
        Endereco enderecoImovel = imovel.getEndereco();

        ruaTextField.setText(enderecoImovel.getRua());
        bairroTextField.setText(enderecoImovel.getBairro());
        numeroTextField.setText(Integer.toString(enderecoImovel.getNumero()));
        cidadeTextField.setText(enderecoImovel.getCidade());
        ufTextField.setText(enderecoImovel.getUf());
    }

    public void voltar(ActionEvent e) throws IOException {
        mudarTela("alterarImovel", e);
    }
}
