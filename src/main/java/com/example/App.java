package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("/sample.fxml"));
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
            
        

    