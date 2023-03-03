package com.example.firstproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    @FXML
    TextField nameTextField;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent e) throws IOException {
        String username=nameTextField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        //root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        root=loader.load();

        //get acces to Scene2Controller and their methods
        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(username);


        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
