package pl.pdob.fxcss.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button upperCaseButton;

    @FXML
    private Button lowerCaseButton;

    @FXML
    private Button clearButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println(upperCaseButton);
        System.out.println(lowerCaseButton);
        System.out.println(clearButton);

        upperCaseButton.setOnAction(actionEvent -> {
            String modifiedText = mainTextArea.getText().toUpperCase();
            mainTextArea.setText(modifiedText);
        });

        lowerCaseButton.setOnAction(actionEvent -> {
            String modifiedText = mainTextArea.getText().toLowerCase();
            mainTextArea.setText(modifiedText);
        });

        clearButton.setOnAction(actionEvent -> mainTextArea.clear());

    }
}
