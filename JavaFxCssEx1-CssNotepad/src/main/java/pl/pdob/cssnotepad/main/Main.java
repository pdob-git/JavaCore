package pl.pdob.cssnotepad.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;
import java.util.Objects;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/fxml/textPane.fxml")));

        Scene scene = new Scene(vBox);
        stage.setTitle("Css Notepad");
        stage.setScene(scene);
        showFonts();
        stage.show();
    }

    private void showFonts() {
        List<String> families = Font.getFamilies();
        for (String family : families) {
            System.out.println(family);
        }

    }
}