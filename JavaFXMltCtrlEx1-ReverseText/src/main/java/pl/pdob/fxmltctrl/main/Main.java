package pl.pdob.fxmltctrl.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

//My solution of lesson
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(Objects
                .requireNonNull(
                        getClass().getResource("/fxml/mainPane.fxml")
                        , "Error loading fxml file"));
        Scene scene = new Scene(mainPane);
        stage.setTitle("Events Example");
        stage.setScene(scene);
        stage.show();
    }


}
