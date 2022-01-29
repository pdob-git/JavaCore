package pl.pdob.eventsmodules.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Objects;

//Solution from Course
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
        stage.setTitle("Events Modules Example - Course");
        stage.setScene(scene);
        stage.show();
    }


}
