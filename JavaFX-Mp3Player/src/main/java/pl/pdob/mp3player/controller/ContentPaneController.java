package pl.pdob.mp3player.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ContentPaneController implements Initializable {
    @FXML
    private TableView<?> contentTable;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Content controller created");
    }
}