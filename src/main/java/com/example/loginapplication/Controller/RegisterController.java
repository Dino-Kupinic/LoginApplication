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
    private Label usernameLabel, passwordLabel, passwordConfirmLabel;


    @FXML
    private void onRegisterButtonClicked(ActionEvent event) throws IOException {
        User.setUsername(usernameField.getText());
        User.setPassword(usernameField.getText());

        if (usernameField.getText().isEmpty()) {
            usernameLabel.setText("* Missing");
        }
        if (passwordField.getText().isEmpty()) {
            passwordLabel.setText("* Missing");
        }
        if (passwordConfirmField.getText().isEmpty()) {
            passwordConfirmLabel.setText("* Missing");
        }
        if (!User.getUsername().isEmpty() && !User.getPassword().isEmpty() && termsBox.isSelected()) {
            switchToLoginScreen(event);
        }
    }

    private void switchToLoginScreen(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/Login-view.fxml"));
        Parent root = fxmlLoader.load();

        //LoginController loginController = fxmlLoader.getController();
        switchWindow(event, root);
    }



    @FXML
    private void onUsernameTyped(ActionEvent event) {
        String tempname = usernameField.getText();
        System.out.println(tempname);
    }





}
