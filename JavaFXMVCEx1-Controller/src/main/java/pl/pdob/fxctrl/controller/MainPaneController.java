package pl.pdob.fxctrl.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {

    @FXML
    private Label firstLabel;

    @FXML
    private Button firstButton;

    @FXML
    private Label secondLabel;

    @FXML
    private Button secondButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstLabel.setText("Etykieta 1");
        secondLabel.setText("Etykieta 2");
        firstButton.setText("Przycisk 1");
        secondButton.setText("Przycisk 2");

    }
}
