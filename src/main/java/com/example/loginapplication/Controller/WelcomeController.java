package com.example.loginapplication.Controller;

import com.example.loginapplication.Modell.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.io.IOException;

import static com.example.loginapplication.LoginApplication.switchWindow;

public class WelcomeController {
    @FXML
    private Label welcomeUserField;
    @FXML
    private ProgressBar welcomeScreenProgressBar;
    @FXML
    private Button progressButton;

    private int i = 0;
    private double progress = 0.0;

    @FXML
    public void displayWelcomeScreen() {
            welcomeUserField.setText(User.getUsername());
    }

    @FXML
    private void handleProgressBar(ActionEvent event) throws IOException {
        if (i < 5) {
            progress += 0.2;
            welcomeScreenProgressBar.setProgress(progress);
            i++;
        } else {
            switchToMainScreen(event);
        }
    }


    private void switchToMainScreen(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Main-view.fxml"));
        Parent root = fxmlLoader.load();

        switchWindow(event, root, "Main");
    }

}
