package pl.pdob.fxmlctrl.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {
    @FXML
    private ControlPaneController controlPaneController;

    @FXML
    private ContentPaneController contentPaneController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Button lowerCase = controlPaneController.getLowerCaseButton();
        Button upperCase = controlPaneController.getUpperCaseButton();
        TextArea textArea = contentPaneController.getMainTextArea();

        lowerCase.setOnAction(x -> textArea.setText(textArea.getText().toLowerCase()));
        upperCase.setOnAction(x -> textArea.setText(textArea.getText().toUpperCase()));
    }

}
