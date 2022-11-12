package com.example.loginapplication.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class SettingsController {
    @FXML
    private ColorPicker colorPicker;

    @FXML
    private void onColorPickerAdjust() {
        Color bgColor = colorPicker.getValue();
        MainController.changeBackgroundColor(bgColor);
        System.out.println(bgColor);
    }
}
