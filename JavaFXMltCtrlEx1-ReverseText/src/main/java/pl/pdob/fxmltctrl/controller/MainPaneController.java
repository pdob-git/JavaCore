package pl.pdob.fxmltctrl.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {

    @FXML
    private TextPaneController textPaneController;


    private TextArea inputTextArea;


    private TextArea outputTextArea;

    @FXML
    private Button clearButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        inputTextArea = textPaneController.getInputTextArea();
        outputTextArea = textPaneController.getOutputTextArea();

        clearButton.setOnAction(this::clearButtonAction);
        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, this::inputTextAreaAction);
        outputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, this::outputTextAreaAction);

    }

    private void clearButtonAction(ActionEvent actionEvent){
        inputTextArea.clear();
        outputTextArea.clear();
    }

    private void inputTextAreaAction(KeyEvent keyEvent){
        StringBuilder stringBuilder = new StringBuilder(inputTextArea.getText());
        stringBuilder.reverse();
        outputTextArea.setText(stringBuilder.toString());
    }

    private void outputTextAreaAction(KeyEvent keyEvent) {
        StringBuilder stringBuilder = new StringBuilder(outputTextArea.getText());
        stringBuilder.reverse();
        inputTextArea.setText(stringBuilder.toString());
    }
}
