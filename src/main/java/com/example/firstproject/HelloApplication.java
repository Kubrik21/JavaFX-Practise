package com.example.firstproject;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
    }

    public static void main(String[] args) {
        launch(args);
    }
}