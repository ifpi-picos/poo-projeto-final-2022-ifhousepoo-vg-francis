package com.example;

import com.example.Dados.AluguelDados;
import com.example.Dados.ImovelDados;
import com.example.Dados.UsuarioDados;
import com.example.Entidades.Aluguel;
import com.example.Entidades.Endereco;
import com.example.Entidades.Imovel;
import com.example.Entidades.Usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("/telas/inicio.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (root == null) {
            return;
        }

        Scene scene = new Scene(root);

        Image icon = new Image("/icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("IFHouse");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
            
        

    