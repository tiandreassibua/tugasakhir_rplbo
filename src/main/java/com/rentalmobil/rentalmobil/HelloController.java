package com.rentalmobil.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void toDataMobilAdmin(ActionEvent eventMenu) throws IOException {
        Parent toMenu = FXMLLoader.load(getClass().getResource("datamobil-admin.fxml"));
        Scene sceneMenu = new Scene(toMenu);
        Stage stageMenu = (Stage) ((Node) eventMenu.getSource()).getScene().getWindow();

        stageMenu.setScene(sceneMenu);
        stageMenu.show();
    }
}