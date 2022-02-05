package pl.pdob.fxmedia;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController_backup implements Initializable {
    @FXML
    private Button playButton;
    @FXML
    private MediaView mediaView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//
        playButton.setOnAction(actionEvent -> {
            buttonClick();
        });



    }

    private void buttonClick() {
//        Media media = new Media("https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_1mb.mp4");

//        https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_30mb.mp4
////        Media media = new Media("https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_30mb.mp4");
//        String path = Paths.get("03-TaylorSwift_Style.mp3").toUri().toString();
//        System.out.println(getClass().getResource("03-TaylorSwift_Style.mp3").toExternalForm());
//        System.out.println("file:///home/synkmint/Gitrepos/JavaCore/JavaFxMedia-Lesson/src/main/resources/03-TaylorSwift_Style.mp3");

        //working mp3 example
//        String s = new File("03-TaylorSwift_Style.mp3").toURI().toString();
//        System.out.println(s);
//        Media media = new Media(s);

        Media media = new Media("https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_30mb.mp4");
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);
        mediaView.setMediaPlayer(player);
        player.setOnError(() -> System.out.println("Error: "+ player.getError()));
        System.out.println(media.getDuration());
    }
}
