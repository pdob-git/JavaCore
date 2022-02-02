package pl.pdob.cssnotepad.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class NotepadController implements Initializable {

    @FXML
    private TextArea textArea;

    @FXML
    private Button button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        button.setOnAction(actionEvent -> textArea.clear());

    }
}
