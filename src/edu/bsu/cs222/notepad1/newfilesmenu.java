package edu.bsu.cs222.notepad1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class newfilesmenu {

    public void Back(ActionEvent actionEvent) throws IOException {
        Parent rootView = FXMLLoader.load(getClass().getResource("mainmenu.fxml"));

        Scene tableViewScene = new Scene(rootView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }
}
