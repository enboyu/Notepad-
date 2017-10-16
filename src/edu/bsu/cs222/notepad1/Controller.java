package edu.bsu.cs222.notepad1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
/*
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
*/
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    public void Newfilesbutton(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("newfilesmune.fxml"));

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void Review(ActionEvent actionEvent) {
    }

    public void Quit(ActionEvent actionEvent) {
    }
}
