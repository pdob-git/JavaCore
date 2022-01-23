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
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;

import java.net.URL;
import java.util.ResourceBundle;


/*
Keyboard Events
setOnKeyPressed() - wciśnięcie klawisza na klawiaturze,
setOnKeyReleased() - zwolnienie klawisza na klawiaturze,
setOnKeyTyped() - wciśnięcie i zwolnienie klawisza na klawiaturze.

Mouse Events

setOnMouseEntered() - zdarzenie wywoływane, gdy kursor zostaje wprowadzony nad słuchacza,
setOnMouseExited() - zdarzenie wyjścia kursora poza słuchacza,
setOnMouseClicked() - zdarzenie wywoływane przy kliknięciu przyciskiem w obszarze słuchacza (wciśnięcie i puszczenie przycisku),
setOnMouseDragged() - przesunięcie kursora z wciśniętym przyciskiem nad obszarem słuchacza,
setOnMouseMoved() - przesunięcie kursora nad słuchaczem bez wciśniętych przycisków,
setOnMousePressed() - wciśnięcie przycisku nad obszarem słuchacza,
setOnMouseReleased() - zwolnienie przycisku nad obszarem słuchacza.
*/


public class MainPaneController implements Initializable {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mainTextArea.addEventFilter(MouseEvent.ANY, x -> System.out.println("Dowolne zdarzenie myszy"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_CLICKED, x -> System.out.println("Wciśnięto i puszczono przycisk myszy"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_DRAGGED, x -> System.out.println("Przesunięto mysz z wciśniętym przyciskiem"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_ENTERED, x -> System.out.println("Mysz w obszarze kontrolki - witaj myszko!"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_EXITED, x -> System.out.println("Mysz opuściła obszar kontrolki - żegnaj myszko!"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_MOVED, x -> System.out.println("Przesunięcie myszy bez wciśniętych przycisków"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_PRESSED, x -> System.out.println("Wciśnięto przycisk myszy"));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_RELEASED, x -> System.out.println("Zwolniono przycisk myszy"));

        mainTextArea.addEventFilter(KeyEvent.ANY, x -> System.out.println("Dowolne zdarzenie klawiatury"));
        mainTextArea.addEventFilter(KeyEvent.KEY_PRESSED, x -> System.out.println("Wciśnięto przycisk"));
        mainTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x -> System.out.println("Zwolniony przycisk"));
        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, x -> System.out.println("Wciśnięto i puszczono przycisk"));
    }
}
