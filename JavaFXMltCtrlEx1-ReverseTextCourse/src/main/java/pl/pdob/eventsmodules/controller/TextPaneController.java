package pl.pdob.eventsmodules.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class TextPaneController implements Initializable {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    public TextArea getInputTextArea() {
        return inputTextArea;
    }

    public TextArea getOutputTextArea() {
        return outputTextArea;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
                x -> reverseTextHandler(inputTextArea, outputTextArea)
        );
        outputTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
                x -> reverseTextHandler(outputTextArea, inputTextArea)
        );
    }

    private void reverseTextHandler(TextArea source, TextArea target) {
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }


}