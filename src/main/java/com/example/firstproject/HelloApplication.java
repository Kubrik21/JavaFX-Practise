package com.example.firstproject;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene1.fxml"));
        //Group root = new Group()
        Scene scene = new Scene(fxmlLoader.load(), 640, 440, Color.BLACK);
        scene.getStylesheets().add(HelloApplication.class.getResource("main.css").toExternalForm());
        //String css = HelloApplication.class.getResource("main.css").toExternalForm();
        //scene.getStylesheets().add(css);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            //Odznacza zdarzenie jako obsłużone. Bez tego bez względu na wybór opcji program zostanie zamknięty bo kliknięto 'x'
            event.consume();
            logout(stage);
        });
    }

    public void logout(Stage stage){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText(" You're about to logout!");
        alert.setContentText("Do you want to save before exiting?:");

        if(alert.showAndWait().get()== ButtonType.OK) {
            stage.close();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}