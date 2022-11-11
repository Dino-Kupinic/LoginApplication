package com.example.loginapplication.Controller;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController {
    @FXML
    private Button settingsButton;
    @FXML
    private Button infoButton;
    @FXML
    private Label welcomeLabel;

    @FXML
    private void onSettingsButtonClick() {
        Stage settingsStage = new Stage();
        Scene settingsScene = new Scene(new Group(), 400, 500);
        settingsStage.setTitle("Settings");
        settingsStage.initModality(Modality.APPLICATION_MODAL);
        settingsStage.setScene(settingsScene);
        settingsStage.show();


    }

    @FXML
    private void onInfoButtonClick() {

    }

}
