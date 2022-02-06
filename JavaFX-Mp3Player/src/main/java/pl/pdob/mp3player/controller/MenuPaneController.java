package pl.pdob.mp3player.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MenuPaneController implements Initializable {
    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        configureMenu();
    }

    public MenuItem getFileMenuItem() {
        return fileMenuItem;
    }

    public MenuItem getDirMenuItem() {
        return dirMenuItem;
    }

    public MenuItem getCloseMenuItem() {
        return closeMenuItem;
    }

    public MenuItem getAboutMenuItem() {
        return aboutMenuItem;
    }


    private void configureMenu() {
        closeMenuItem.setOnAction(x -> Platform.exit());

        aboutMenuItem.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent arg0) {
                try {
                    Parent parent = FXMLLoader.load(getClass().getResource("/fxml/aboutPane.fxml"));
                    Scene scene = new Scene(parent);
                    Stage stage = new Stage();
                    stage.setTitle("Mp3Player v1.0 - about");
                    stage.setScene(scene);
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace(); //ignore
                }
            }
        });
    }
}