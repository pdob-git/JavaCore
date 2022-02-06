package pl.pdob.fxmedia;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.media.MediaPlayer.Status.*;

public class MainController implements Initializable {
    @FXML
    private Button playButton;
    @FXML
    private MediaView mediaView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Media media = new Media("https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_1mb.mp4");
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);
        mediaView.setMediaPlayer(player);
        player.setOnError(() -> System.out.println("Error: "+player.getError()));

        player.setOnReady(() -> {
            System.out.println(media.getDuration());
        });

        playButton.setOnAction(actionEvent -> {
            if (player.getStatus() == PLAYING){
                player.pause();
                playButton.setText("Play");
            } else if(player.getStatus() == PAUSED || player.getStatus() == READY){
                player.play();
                playButton.setText("Pause");
            }
        });
    }
}
