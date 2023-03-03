package com.example.firstproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Scene2Controller {

    @FXML
    Label nameLabel;
    @FXML
    private Button logoutButton;
    @FXML
    private AnchorPane anchorPane;
    Stage stage;

    public void displayName(String username){

        nameLabel.setText("Hello: "+ username);
    }
    public void logout(ActionEvent e){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText(" You're about to logout!");
        alert.setContentText("Do you want to save before exiting?:");

        if(alert.showAndWait().get()== ButtonType.OK) {


            //Pobieramy obecną scenę by ją zamknąć
            stage = (Stage) anchorPane.getScene().getWindow();
            stage.close();
        }
    }
}
