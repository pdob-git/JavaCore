package pl.pdob.fxproperties.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/volumePane.fxml")));
        Scene scene = new Scene(mainPane);
        stage.setTitle("FX Properties lesson");
        stage.setScene(scene);
        stage.show();

    }
}
