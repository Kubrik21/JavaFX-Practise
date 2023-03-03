package com.example.firstproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;



    public void change1(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

//    public void change2(ActionEvent e) throws IOException {
//
//    }

//public void login(ActionEvent e) throws IOException{
//    root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
//    stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
//    scene= new Scene(root);
//    stage.setScene(scene);
//    stage.show();
//}

}
