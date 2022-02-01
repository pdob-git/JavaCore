package pl.pdob.fxcss.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/mainPane.fxml")));

        Scene scene = new Scene(vBox);
        stage.setTitle("Css");
        stage.setScene(scene);
        stage.show();
    }

}
