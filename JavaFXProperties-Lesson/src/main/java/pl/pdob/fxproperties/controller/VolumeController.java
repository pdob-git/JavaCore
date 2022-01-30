package pl.pdob.fxproperties.controller;

import javafx.beans.binding.StringBinding;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class VolumeController implements Initializable {

    @FXML
    private Slider volumeSlider;

    @FXML
    private Label volumeLevelLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        //Create Integer Property
//        SimpleIntegerProperty simpleIntegerProperty = new SimpleIntegerProperty();
//        //Connect VolumeSlider value with integer. Convert Double Property to IntegerProperty
//        simpleIntegerProperty.bind(volumeSlider.valueProperty());
//        //Convert to string binding
//        StringBinding stringBinding = simpleIntegerProperty.asString();
//        //Connect lable value with converted volume slider value
//        volumeLevelLabel.textProperty().bind(stringBinding );


        //Solution from course
        volumeLevelLabel.textProperty().bind(volumeSlider.valueProperty().asString("%.2f"));


        //Add listener to volume slider
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            double volume = (Double) newValue;
            if (volume > 75) {
                System.out.println("Za głośno!");
            } else if (volume < 10) {
                System.out.println("Nic nie słychać");
            }

        });
    }
}
