package pl.pdob.fxbrowser;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Main extends Application implements Initializable {
    @FXML
    private Button backButton;
    @FXML
    private Button nextButton;
    @FXML
    private WebView webView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/browserPane.fxml")));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Przeglądarka");
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        WebEngine engine = webView.getEngine();
        engine.load("https://google.pl");
        backButton.setOnAction(x -> engine.executeScript("history.back();"));
        nextButton.setOnAction(x -> {
            engine.executeScript("history.forward();");
        });

    }
}
