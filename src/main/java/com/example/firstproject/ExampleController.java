package com.example.firstproject;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

public class ExampleController {


    @FXML
    private Circle myCircle;
    private double x;
    private double y;


    public void up(ActionEvent e){
        //.out.println("Up");
        myCircle.setCenterY(y-=10);
    }
    public void down(ActionEvent e){
        //System.out.println("Down");
        myCircle.setCenterY(y+=10);
    }
    public void left(ActionEvent e){
        //System.out.println("Left");
        myCircle.setCenterX(x-=10);
    }
    public void right(ActionEvent e){
        //System.out.println("Right");
        myCircle.setCenterX(x+=10);
    }

}
