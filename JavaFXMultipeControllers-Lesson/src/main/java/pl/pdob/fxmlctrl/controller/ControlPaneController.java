package pl.pdob.fxmlctrl.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ControlPaneController implements Initializable {
    @FXML
    private Button upperCaseButton;
    @FXML
    private Button lowerCaseButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public Button getUpperCaseButton() {
        return upperCaseButton;
    }

    public Button getLowerCaseButton() {
        return lowerCaseButton;
    }
}
