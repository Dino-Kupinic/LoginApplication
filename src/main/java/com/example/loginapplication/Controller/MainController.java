package com.example.loginapplication.Controller;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController extends Application {
    @FXML
    private Button settingsButton;
    @FXML
    private Button infoButton;
    @FXML
    private Label welcomeLabel;
    @FXML
    private static AnchorPane mainBackground;

    @FXML
    public static void changeBackgroundColor(Color bgcolor) {
        String color = String.valueOf(bgcolor);
        System.out.println(color);
        mainBackground.setStyle("-fx-background-color: " + color);
    }

    @FXML
    private void onSettingsButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Settings-view.fxml"));
        Parent root = fxmlLoader.load();
        Stage settingsStage = new Stage();
        Scene settingsScene = new Scene(root);


        settingsStage.setTitle("Settings");
        settingsStage.initModality(Modality.APPLICATION_MODAL);
        settingsStage.setResizable(false);
        settingsStage.setScene(settingsScene);
        settingsStage.show();


    }

    @FXML
    private void onInfoButtonClick() {

    }

    @FXML
    private void flashWelcomeLabel() {

    }

    @Override
    public void start(Stage stage) {

    }

}
