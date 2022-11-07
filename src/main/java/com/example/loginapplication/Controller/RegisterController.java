package com.example.loginapplication.Controller;

import com.example.loginapplication.Modell.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.example.loginapplication.LoginApplication.switchWindow;

public class RegisterController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField passwordConfirmField;
    @FXML
    private CheckBox termsBox;
    @FXML
    private Label usernameLabel;
    @FXML
    private Label termsLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label passwordConfirmLabel;


    @FXML
    private void onRegisterButtonClicked(ActionEvent event) throws IOException {
        User.setUsername(usernameField.getText());
        User.setPassword(passwordField.getText());

        returnToNeutralState();
        checkRegisterFields();
        /*
        - Username und Passwort dürfen nicht leer sein
        - Passwörter müssen übereinstimmen
        - Checkbox muss aktiv sein
         */
        if (!User.getUsername().isEmpty() && !User.getPassword().isEmpty()
                && User.getPassword().equals(passwordConfirmField.getText())
                && termsBox.isSelected()) {
            switchToLoginScreen(event);
        }
    }

    private void returnToNeutralState() {
        usernameLabel.setText("* required");
        passwordLabel.setText("* required");
        passwordConfirmLabel.setText("* required");
        termsLabel.setText("* required");
    }

    private void checkRegisterFields() {
        if (usernameField.getText().isEmpty()) {
            usernameLabel.setText("* missing");
        }
        if (passwordField.getText().isEmpty()) {
            passwordLabel.setText("* missing");
        }
        if (passwordConfirmField.getText().isEmpty()) {
            passwordConfirmLabel.setText("* missing");
        }
        if (!termsBox.isSelected()) {
            termsLabel.setText("* missing");
        }
    }

    private void switchToLoginScreen(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Login-view.fxml"));
        Parent root = fxmlLoader.load();

        //LoginController loginController = fxmlLoader.getController();
        switchWindow(event, root);
    }









}
