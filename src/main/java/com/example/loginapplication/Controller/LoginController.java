package com.example.loginapplication.Controller;

import com.example.loginapplication.Modell.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

import static com.example.loginapplication.LoginApplication.switchWindow;

public class LoginController {

    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Label isValidLabel;

    private String loginUsername = "";
    private String loginPassword = "";

    @FXML
    private void onLoginButtonClick(ActionEvent event) throws IOException {
        loginUsername = usernameField.getText();
        loginPassword = passwordField.getText();
        checkInput();
        if (checkInput()) {
            switchToWelcomeScreen(event);
        } else {
            isValidLabel.setText("Incorrect Input");
            isValidLabel.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    private void onRegisterButtonClick(ActionEvent event) throws IOException {
        switchToRegisterScreen(event);
    }

    private void switchToWelcomeScreen(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Welcome-view.fxml"));
        Parent root = fxmlLoader.load();

        WelcomeController welcomeController = fxmlLoader.getController();
        welcomeController.displayWelcomeScreen();
        switchWindow(event, root, "Welcome");
    }

    private void switchToRegisterScreen(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Register-view.fxml"));
        Parent root = fxmlLoader.load();

        //RegisterController registerController = fxmlLoader.getController();
        switchWindow(event, root, "Register");
    }

    private boolean checkInput() {
        displayCurrentCredentials();
        return loginUsername.equals(User.getUsername()) && loginPassword.equals(User.getPassword());
    }

    private void displayCurrentCredentials() {
        System.out.println("--------------------");
        System.out.println("login user: " + loginUsername);
        System.out.println("login password: " + loginPassword);
        System.out.println("register user: " + User.getUsername());
        System.out.println("register password: " + User.getPassword());
    }


}
