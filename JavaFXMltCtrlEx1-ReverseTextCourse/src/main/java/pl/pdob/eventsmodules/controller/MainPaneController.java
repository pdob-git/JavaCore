package pl.pdob.eventsmodules.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {

    @FXML
    private TextPaneController textPaneController;

    @FXML
    private Button clearButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        var inputTextArea = textPaneController.getInputTextArea();
        var outputTextArea = textPaneController.getOutputTextArea();

        clearButton.setOnAction(event -> {
            inputTextArea.clear();
            outputTextArea.clear();
        });
    }


}
