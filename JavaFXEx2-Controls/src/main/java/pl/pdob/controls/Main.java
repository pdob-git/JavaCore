package pl.pdob.controls;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = FXMLLoader.load(getClass().getResource("/fxml/mainPane.fxml"));

        Scene scene = new Scene(vBox);
        stage.setTitle("Controls");
        stage.setScene(scene);
        stage.show();
    }

}
