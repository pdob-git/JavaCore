package pl.pdob.fxaction.controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;

public class MainPaneController implements Initializable {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.print(event.getCharacter());
            }
        });

    }

    @FXML
    void toLowerCaseAction(ActionEvent event) {
        String originalText = mainTextArea.getText();
        String lowerText = originalText.toLowerCase();
        mainTextArea.setText(lowerText);
        System.out.println();
        System.out.println("Button Pressed");
        System.out.println(event.getEventType());
    }

}
