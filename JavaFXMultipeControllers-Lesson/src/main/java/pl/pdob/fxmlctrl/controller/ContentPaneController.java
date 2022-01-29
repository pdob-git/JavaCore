package pl.pdob.fxmlctrl.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {
    @FXML
    private TextArea mainTextArea;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public TextArea getMainTextArea() {
        return mainTextArea;
    }
}
