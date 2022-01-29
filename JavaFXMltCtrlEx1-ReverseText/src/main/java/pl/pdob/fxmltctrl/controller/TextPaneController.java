package pl.pdob.fxmltctrl.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class TextPaneController implements Initializable {
    @FXML
    private TextArea inputTextArea;
    @FXML
    private TextArea outputTextArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public TextArea getInputTextArea() {
        return inputTextArea;
    }

    public TextArea getOutputTextArea() {
        return outputTextArea;
    }
}
